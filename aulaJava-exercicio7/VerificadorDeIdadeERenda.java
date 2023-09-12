import java.util.Scanner;

public class VerificadorDeIdadeERenda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade;
        float salario;
        int habilitacao;

        System.out.print("Digite a sua idade: ");
        idade = scan.nextInt();
        System.out.println();


        if (idade >= 18) {

            System.out.println("Você tem habilitação? 1 = sim, 0 = não. Digite sua resposta: ");
            habilitacao = scan.nextInt();
            System.out.println();

            if (habilitacao == 1) {

                System.out.print("Digite o seu salário: ");
                salario = scan.nextFloat();
                System.out.println();

                if (salario >= 2000.00) {
                    System.out.println("Parabéns, você conseguiu um consórcio para adquirir um automóvel.");
                } else {
                    System.out.println("O seu salário é incompatível.");
                }
            } else {
                System.out.println("Você não tem habilitação, não pode comprar um automóvel.");
            }
        } else {
            System.out.println("Você não pode comprar um automóvel Sendo menor de idade.");
        }

    }
}
