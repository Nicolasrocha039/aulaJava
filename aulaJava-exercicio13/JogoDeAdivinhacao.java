import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tentativas = 3;
        int inimigos = 300000;
        int resposta;

        System.out.println("Você tem "+tentativas+" tentativas");

        for (tentativas = 3; tentativas != 0; tentativas--) {
            System.out.print("Chute quantos inimigos existem (digite apenas números): ");
            resposta = in.nextInt();
            System.out.println();

            if (resposta > inimigos) {
                System.out.println("Um pouco menos!");
                System.out.println("Você tem "+tentativas+" tentativas");
            } else if (resposta < inimigos) {
                System.out.println("Um pouco mais!");
                System.out.println("Você tem "+tentativas+" tentativas");
            } else if (resposta == inimigos) {
                System.out.println("Parabéns, você acertou!");
                break;
            }

        }
    }
}
