public class Main {
    public static void main(String[] args) {
        Computador desktop = new Desktop(16, 1, 3);
        Computador notebook = new Notebook(8,1,15);
        
        System.out.println("O valor do seu Desktop e: R$" + desktop.calculaValor());
        System.out.println("O valor do seu Notebook e: R$" + notebook.calculaValor());
    }
}
