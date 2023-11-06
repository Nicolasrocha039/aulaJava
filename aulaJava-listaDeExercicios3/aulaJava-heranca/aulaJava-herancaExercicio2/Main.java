public class Main {
    public static void main(String[] args) {
        IngressoVip vip = new IngressoVip(0.95);
        Ingresso ingresso = new Ingresso("Show de musica", 100, vip);

        ingresso.imprimir(vip);
    }
}
