package src.java;

public class Main {
    public static void main(String[] args) {
        Autor a1 = new Autor("J.K. Rowling", "hpnaveia@harrypotter.com","Britanica");
        Livro l1 = new Livro(a1,"Harry Potter e a Pedra Filosofal", "Ficcao", 2);
        Livro hpD = new LivroDigital(a1,l1, 12000, 6.5);
        Livro hpF = new LivroFisico(a1, l1, 2000, 2);

        System.out.println(hpD);
        System.out.println(hpF);
    }
}
