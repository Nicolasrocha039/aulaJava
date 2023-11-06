import java.lang.reflect.Field;

public class Desktop extends Computador implements Imprimivel {
    private double acessorios;

    Desktop(int gbMemoria, int numProcessadores, double acessorios) {
        this.gbMemoria = gbMemoria;
        this.numProcessadores = numProcessadores;
        this.acessorios = acessorios;
    }

    @Override
    public double calculaValor() {
        return gbMemoria*200 + numProcessadores*400 + acessorios;
    }

    @Override
    public void imprimir() {
        for (Field f : getClass().getDeclaredFields()) {
            System.out.println(f.getName());
        };
    }
}
