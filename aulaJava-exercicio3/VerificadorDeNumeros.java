import java.util.Scanner;

public class VerificadorDeNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SomaMedia sm = new SomaMedia();


        System.out.print("Digite o primeiro número: ");
        sm.setNumeroA(scan.nextFloat());
        System.out.println();

        System.out.print("Digite o segundo número: ");
        sm.setNumeroB(scan.nextFloat());
        System.out.println();

        System.out.print("Digite o terceiro número: ");
        sm.setNumeroC(scan.nextFloat());
        System.out.println();


        System.out.println("O maior número é: "+sm.achaMaiorNumero());
        System.out.println("O menor número é: "+sm.achaMenorNumero());
        System.out.println("A média é: "+sm.getMedia());


    }
}
