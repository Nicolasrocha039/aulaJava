public class Notebook extends Computador{
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
}
