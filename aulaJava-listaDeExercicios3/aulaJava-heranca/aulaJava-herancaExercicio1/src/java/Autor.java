package src.java;

public class Autor {
    private String nome;
    private String email;
    private String nacionalidade;

    Autor() {}

    Autor(String nome, String email, String nacionalidade) {

        setNome(nome);
        setEmail(email);
        setNacionalidade(nacionalidade);
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setEmail(String email) {
        this.email = email;
    }

    void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "Autor { " + "\n" +
                "nome = " + this.nome + '\n' +
                "email = " + this.email + '\n' +
                "nacionalidade = " + this.nacionalidade + '\n' +
                '}';
    }
}
