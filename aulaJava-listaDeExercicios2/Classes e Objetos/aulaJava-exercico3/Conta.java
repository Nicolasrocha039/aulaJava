import java.text.DecimalFormat;

public class Conta {
    Cliente cliente = new Cliente();
    DecimalFormat df = new DecimalFormat();

    int numeroDaConta;
    double saldo;
    double limiteDeCredito;


    public Conta(String nome, String dn, int cc, double deposito) {
        cliente.setTitular(nome);
        cliente.setDataDeNascimento(dn);
        setNumeroDaConta(cc);
        depositar(deposito);
        setLimiteDeCredito(deposito);

    }

    public void setLimiteDeCredito(double primeiroDeposito) {
        if (primeiroDeposito <= 100) {
            this.limiteDeCredito = 500;
        } else if (primeiroDeposito > 200 && primeiroDeposito < 500) {
            this.limiteDeCredito = 1000;
        } else if (primeiroDeposito > 500) {
            this.limiteDeCredito = 5000;
        }
    }

    public void setNumeroDaConta(int cc) {
        this.numeroDaConta = cc;
    }

    public int getNumeroDaConta() {
        return this.numeroDaConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getLimite() {
        return this.limiteDeCredito;
    }

    boolean sacar(double valor) {
        if (valor >= this.saldo) {
            this.saldo-=valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    boolean depositar(double valor) {
        if (valor > 10) {
            this.saldo+=valor;
            return true;
        } else {
            System.out.println("O deósito deve ser maior que R$10");
            return false;
        }
    }

    public void info() {
        df.applyPattern("###,###.00");
        System.out.println("O cliente se chama: "+cliente.getTitular());
        System.out.println("Número da conta: "+getNumeroDaConta());
        System.out.println("O cliente nasceu em: "+cliente.getDataDeNascimento());
        System.out.println("O banco disponibilizou um limite de R$"+df.format(getLimite())+" no cartão de crédito e no crédito especial");
        System.out.println("Seu saldo é de R$"+df.format(getSaldo()));
    }
}
