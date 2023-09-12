import java.util.Date;

public class CalculadorDeSegundos {
    public static void main(String[] args) {
        int hora = 9;
        int minutos = 40;
        int segundos = 0;
        int horaInicial;
        int horaFinal;

        horaInicial = segundos+minutos*60+hora*3600;
        horaFinal = 86400-horaInicial;

        System.out.println("O dia começou à "+horaInicial+" segundos.");
        System.out.println("Faltam "+horaFinal+" segundos para o dia acabar");

    }
}
