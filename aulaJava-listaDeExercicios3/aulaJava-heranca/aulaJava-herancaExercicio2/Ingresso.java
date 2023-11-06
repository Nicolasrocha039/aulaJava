public class Ingresso {
    public String nomeEvento;
    public double valor;
    public boolean vip;

    Ingresso(String nomeEvento, double valor) {
        setNomeEvento(nomeEvento);
        setValor(valor);
    }

    Ingresso(String nomeEvento, double valor, IngressoVip vip) {
        setNomeEvento(nomeEvento);
        setValor(valor);
        this.vip = vip.adicional != 0;
    }

    Ingresso(){}

    public void imprimir(IngressoVip invip) {
        System.out.println("Nome do Evento: " + getNomeEvento());
        System.out.println("Valor do ingresso: R$" + getValor());

        if (vip){
            System.out.println(invip.imprimir(getValor()));
        } else {
            System.out.println("Ingresso standard");
        }

    }

    public String getNomeEvento() {
        return this.nomeEvento;
    }

    public double getValor() {
        return this.valor;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
