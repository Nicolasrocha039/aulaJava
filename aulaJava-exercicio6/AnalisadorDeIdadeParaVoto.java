import java.util.Scanner;

public class AnalisadorDeIdadeParaVoto {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade;
        int temDeficiencia;
        int votoFacultativo;

        System.out.print("Digite a sua idade: ");
        idade = scan.nextInt();
        System.out.println();

        System.out.print("Você é deficiente físico? Digite 1 pra sim e 0 pra não. ");
        temDeficiencia = scan.nextInt();
        System.out.println();

        if (temDeficiencia == 1 && idade >= 18 && idade <= 65) {
            System.out.print("Você  obrigado a votar? 1 = sim, 0 = não. ");
            votoFacultativo = scan.nextInt();
            if (votoFacultativo == 0) {
                System.out.println("O seu voto é facultativo, independente da sua idade.");
            } else {
                System.out.println("O seu voto é obrigatório.");
            }
        } else {
            if (idade < 16) {
                System.out.println("Você não pode votar");
            } else if (idade >= 16 && idade <= 17 || idade > 65) {
                System.out.println("O seu voto é facultativo");
            } else if (idade >= 18 && idade <= 65) {
                System.out.println("O seu voto é obrigatrio.");
            }
        }

    }
}
