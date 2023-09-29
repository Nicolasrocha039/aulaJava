import java.text.DecimalFormat;

public class Aluno {
    private String nome;
    private String curso;
    private String cpf;
    Avaliacao avaliacao = new Avaliacao();
    DecimalFormat df = new DecimalFormat();

    public Aluno(String nome, String curso, String cpf, double n1, double n2, double n3) {
        setNome(nome);
        setCurso(curso);
        setCpf(cpf);
        avaliacao.setNota1(n1);
        avaliacao.setNota2(n2);
        avaliacao.setNota3(n3);

    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCurso() {
        return this.curso;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void info() {
        df.applyPattern("0.00");
        System.out.println("O aluno se chama: "+getNome());
        System.out.println("O aluno está cursando: "+getCurso());
        System.out.println("A Média Aritmética do aluno é: "+df.format(avaliacao.calculaMediaSimples()));
        System.out.println("A Média Aritmética Ponderada do aluno é: "+df.format(avaliacao.calculaMediaPonderada()));
    }




}
