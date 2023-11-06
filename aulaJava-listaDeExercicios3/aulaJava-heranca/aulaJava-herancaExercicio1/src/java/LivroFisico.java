package src.java;

public class LivroFisico extends Livro{
    private int tiragem;
    private int peso;
    private Livro livro;

    LivroFisico(){}

    LivroFisico(Autor autor, Livro livro, int tiragem, int peso) {
        setAutor(autor);
        setLivro(livro);
        setTiragem(tiragem);
        setPeso(peso);
    }

    public int getTiragem() {
        return this.tiragem;
    }

    public int getPeso() {
        return this.peso;
    }

    public Livro getLivro() {
        return this.livro;
    }

    public void setTiragem(int tiragem) {
        this.tiragem = tiragem;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        return "LivroFisico {" + "\n" +
                "tiragem = " + tiragem + "\n" +
                "peso = " + peso + "\n" +
                "livro = " + livro + "\n" +
                '}';
    }
}
