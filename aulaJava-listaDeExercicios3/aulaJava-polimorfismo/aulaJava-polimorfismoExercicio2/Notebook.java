import java.lang.reflect.Field;

public class Notebook extends Computador implements Imprimivel {
    public int polegadasTela;

    Notebook(int gbMemoria, int numProcessadores, int polegadasTela) {
        this.gbMemoria = gbMemoria;
        this.numProcessadores = numProcessadores;
        this.polegadasTela = polegadasTela;
    }

    @Override
    public double calculaValor() {
        return gbMemoria * 250 + numProcessadores * 500 + polegadasTela * 100;
    }

    @Override
    public void imprimir() {
        for (Field f : getClass().getDeclaredFields()) {
            System.out.println(f.getName());
        }
    }
}
