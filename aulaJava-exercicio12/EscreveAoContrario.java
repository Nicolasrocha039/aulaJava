import java.util.Scanner;

public class EscreveAoContrario {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Escreva um palíndromo: ");
        String x = in.nextLine();
        x = new StringBuffer(x).reverse().toString();

        System.out.println(x);
    }
}
