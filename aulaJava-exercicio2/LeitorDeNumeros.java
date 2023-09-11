import java.util.Scanner;

public class LeitorDeNumeros {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.print("Digite o primeiro número: ");
        float num1 = scan.nextFloat();
        System.out.println();
        System.out.print("Digite o segundo número: ");
        float num2 = scan.nextFloat();
        System.out.println();
        System.out.println("O primeiro número é: "+num1);
        System.out.println("O segundo número é: "+num2);
    }
}
