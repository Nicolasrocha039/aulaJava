import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumerosPrimosComIntervalo {

    public void calculoDePrimos(int n) {
        boolean primos[] = new boolean[n+1];

        for (int i = 0; i <= n; i++) {
            primos[i] = true;
        }

        for (int p = 2; p*p <= n; p++) {
            if (primos[p] == true) {
                for (int i = p*p; i <= n; i += p) {
                    primos[i] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primos[i] == true) {
                System.out.println(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o intervalo que deseja: ");
        int num = in.nextInt();
        System.out.println();

        NumerosPrimosComIntervalo np = new NumerosPrimosComIntervalo();
        np.calculoDePrimos(num);

    }


}
