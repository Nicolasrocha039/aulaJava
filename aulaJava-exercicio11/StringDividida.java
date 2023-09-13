import java.util.Scanner;

public class StringDividida {

    public String texto;
    public String formataDados(String dado) {
        dado = dado.replaceAll(" ", "-");
        return dado;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringDividida sd = new StringDividida();

        System.out.print("Digite uma frase: ");
        sd.texto = in.nextLine();
        sd.texto = sd.formataDados(sd.texto);
        String[] textoDividido = sd.texto.split("-");
        String parte1 = textoDividido[0];
        System.out.println(parte1);
    }
}
