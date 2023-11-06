public class IngressoVip extends Ingresso{

    public double adicional;

    IngressoVip(double adicional){
        this.adicional = adicional;
    }

    IngressoVip() {}

    public String imprimir(double valor) {
        return "Adicional vip: R$" + (valor * this.adicional);
    }
}
