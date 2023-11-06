package src.java;

public class LivroDigital extends Livro{
    private int download;
    private double tamanho;
    private Livro livro;

    LivroDigital(){}

    LivroDigital(Autor autor, Livro livro, int download, double tamanho){
        setAutor(autor);
        setLivro(livro);
        setDownload(download);
        setTamanho(tamanho);
    }

    public int getDownload() {
        return this.download;
    }

    public double getTamanho() {
        return this.tamanho;
    }

    public Livro getLivro() {
        return this.livro;
    }

    public void setDownload(int download) {
        this.download = download;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        return "LivroDigital{" + "\n" +
                "download = " + download + ",\n" +
                "tamanho = " + tamanho + ",\n" +
                "livro = " + livro + "\n" +
                '}';
    }
}
