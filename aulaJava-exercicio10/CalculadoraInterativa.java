import java.util.Scanner;

public class CalculadoraInterativa {
    Scanner in = new Scanner(System.in);
    float num1;
    float num2;
    int opcao;
    float resultado;
    void menu () {
        System.out.println("---------------------------------------");
        System.out.println("|");
        System.out.println("| 1 - Adição");
        System.out.println("| 2 - Subtração");
        System.out.println("| 3 - Multiplicaçåo");
        System.out.println("| 4 - Divisão");
        System.out.println("| 0 - SAIR");
        System.out.println("|");
        System.out.println("---------------------------------------");
        System.out.print("Digite o número correspondente à opção: ");
        opcao = in.nextInt();
        System.out.println();
        verificadorDeOpcao();
    }

    void verificadorDeOpcao() {
        if (opcao == 1) {
            System.out.println("---------------------------------------");
            System.out.print("Digite o primeiro número: ");
            num1 = in.nextFloat();
            System.out.print("Digite o segundo número: ");
            num2 = in.nextFloat();
            System.out.println("---------------------------------------");
            resultado = num1 + num2;
            System.out.println("O resultado é "+resultado);
            menu();
        } else if (opcao == 2) {
            System.out.print("Digite o primeiro número: ");
            num1 = in.nextFloat();
            System.out.println();
            System.out.print("Digite o segundo número: ");
            num2 = in.nextFloat();
            resultado = num1 - num2;
            System.out.println("O resultado é "+resultado);
            menu();
        } else if (opcao == 3) {
            System.out.print("Digite o primeiro número: ");
            num1 = in.nextFloat();
            System.out.println();
            System.out.print("Digite o segundo número: ");
            num2 = in.nextFloat();
            resultado = num1 * num2;
            System.out.println("O resultado é "+resultado);
            menu();
        } else if (opcao == 4) {
            System.out.print("Digite o primeiro número: ");
            num1 = in.nextFloat();
            System.out.println();
            System.out.print("Digite o segundo número: ");
            num2 = in.nextFloat();
            resultado = num1 / num2;
            System.out.println("O resultado é "+resultado);
            menu();
        } else {
            System.out.println("Saindo...");
        }
    }

    public static void main(String[] args) {
        CalculadoraInterativa ci = new CalculadoraInterativa();

        ci.menu();
    }
}
