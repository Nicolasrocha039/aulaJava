import java.text.DecimalFormat;
import java.util.Scanner;

public class Avaliacao {

    DecimalFormat df = new DecimalFormat();
    private double nota1;
    private double nota2;
    private double nota3;


    public double calculaMediaSimples() {
        double mediaAritmetica = (this.nota1 + this.nota2 + this.nota3) / 3;
        return mediaAritmetica;
    }

    public double calculaMediaPonderada() {
        double mediaAritmeticaPonderada = (this.nota1 * 2 + this.nota2 * 3 + this.nota3 * 4) / 9;
        return mediaAritmeticaPonderada;
    }

    public void setNota1(double n1) {
        this.nota1 = n1;
    }

    public void setNota2(double n2) {
        this.nota2 = n2;
    }

    public void setNota3(double n3) {
        this.nota3 = n3;
    }
}
