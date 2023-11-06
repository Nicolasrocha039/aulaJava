public class Desktop extends Computador{
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

    public void setAcessorios(double acessorios) {
        this.acessorios = acessorios;
    }
}
