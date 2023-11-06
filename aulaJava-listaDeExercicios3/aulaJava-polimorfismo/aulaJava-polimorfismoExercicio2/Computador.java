import java.lang.reflect.Field;

public abstract class Computador implements Imprimivel{
    public int gbMemoria;
    public int numProcessadores;

    public Computador() {

    }

    public abstract double calculaValor();

    @Override
    public void imprimir() {
        for (Field f : Computador.class.getDeclaredFields()) {
            System.out.println(f.getName());
        }
    }
}
