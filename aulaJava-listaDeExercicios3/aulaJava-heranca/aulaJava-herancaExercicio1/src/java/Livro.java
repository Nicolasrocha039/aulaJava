package src.java;

public class Livro extends Autor {
    private String titulo;
    private Autor autor;
    private String genero;
    private int edicao;

    Livro() {}

    Livro(Autor autor, String titulo, String genero, int edicao) {
        setAutor(autor);
        setTitulo(titulo);
        setGenero(genero);
        setEdicao(edicao);
    }

    public Livro(Autor autor) {
        setAutor(autor);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public String getGenero() {
        return this.genero;
    }

    public int getEdicao() {
        return this.edicao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public String toString() {
        return "Livro { " + "\n" +
                "titulo = " + titulo + '\n' +
                "autor = " + autor + "\n" +
                "genero = " + genero + '\n' +
                "edicao = " + edicao + "\n" +
                '}';
    }
}
