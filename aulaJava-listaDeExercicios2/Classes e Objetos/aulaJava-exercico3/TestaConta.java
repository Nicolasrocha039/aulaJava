import java.text.DecimalFormat;
import java.util.Date;

public class TestaConta {
    public static void main(String[] args) {

        Conta cc = new Conta("Nicolas Figueiredo", "23/05/2001", 957351, 6000);
        Conta cc2 = new Conta("Nicolas Rocha", "25/03/2002",153759, 100);
        Conta cc3 = new Conta("Gabriel Lima", "05/04/2000", 682446, 20);
        Conta cc4 = new Conta("Gabriel Pereira", "04/05/2001",693716, 1000000000);


        cc.info();
        System.out.println();
        cc2.info();
        System.out.println();
        cc3.info();
        System.out.println();
        cc4.info();
    }
}
