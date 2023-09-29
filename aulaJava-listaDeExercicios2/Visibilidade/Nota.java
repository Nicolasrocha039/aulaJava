import java.util.Scanner;

public class Nota {
    private double nota1;
    private double nota2;
    private int faltas;
    private int operador;
    public void resultado() {
        double media = this.nota1 + this.nota2 / 2;

        if (getFaltas() > 7){
            System.out.println("Você reprovou por exceder o limite de faltas.");
        } else {
            if (media >= 7.5) {
                System.out.println("Você foi aprovado.");
                System.out.println("Sua média foi "+media);
            } else if (media >= 5) {
                System.out.println("Você está em recuperação.");
                System.out.println("Sua média foi "+media);
            } else {
                System.out.println("Você reprovou.");
                System.out.println("Sua média foi "+media);
            }
        }
        System.out.println();
        insereValores();
    }

    public void setNota1(double v1) {
        this.nota1 = v1;
    }

    public void setNota2(double v2) {
        this.nota2 = v2;
    }

    public void setFaltas(int valor) {
        this.faltas = valor;
    }

    public void setOperador(int valor) {
        this.operador = valor;
    }

    public double getNota1() {
        return this.nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

    public int getFaltas() {
        return this.faltas;
    }

    public void insereValores() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira a primeira nota: ");
        setNota1(scan.nextDouble());
        System.out.print("Insira a segunda nota: ");
        setNota2(scan.nextDouble());
        System.out.println("Insira a quantidade de faltas: ");
        setFaltas(scan.nextInt());
        System.out.print("Gostaria de ver o resultado? 1 = sim, 0 = não ");
        setOperador(scan.nextInt());

        if (operador == 0) {
            System.out.println("Fechando");
        } else if (operador == 1) {
            System.out.println();
            resultado();
        }
    }
}
