import java.util.Scanner;

public class Analisador {

    int opcao;

    public void fila1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("| 1 - Deficiente");
        System.out.println("| 2 - Idoso(a)");
        System.out.println("| 3 - Gestante");
        System.out.println("| 4 - Nenhuma das opções acima");
        System.out.println("| 5 - Sair");
        System.out.println("----------------------------------------");
        System.out.print("Digite uma das seguintes opções: ");
        opcao = scan.nextInt();
        System.out.println("----------------------------------------");
        fila2();

    }

    public void fila2() {
        if (opcao == 1 || opcao == 2 || opcao == 3) {
            System.out.println("Você tem direito à fila prioritária.");
            fila1();
        } else if (opcao == 4) {
            System.out.println("Você não tem direito à fila prioritária.");
            fila1();
        } else {
            System.out.println("Saindo.... ");
        }


    }
}
