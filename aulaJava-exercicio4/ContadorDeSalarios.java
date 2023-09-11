import java.util.Scanner;

public class ContadorDeSalarios {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float salarioMinimo;
        float salarioInformado;

        System.out.print("Digite o salário mnimo atual do seu país: ");
        salarioMinimo = scan.nextFloat();
        System.out.println();
        System.out.print("Digite o seu salÏrio atual: ");
        salarioInformado = scan.nextFloat();
        System.out.println();

        System.out.println("Você recebe "+Math.round(salarioInformado/salarioMinimo)+" salários mínimos");


    }
}
