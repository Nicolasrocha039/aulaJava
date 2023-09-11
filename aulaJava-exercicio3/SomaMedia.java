public class SomaMedia {

    private float numeroA;
    private float numeroB;
    private float numeroC;
    private float maiorNumero;
    private float menorNumero;
    private float media;

    public void setNumeroA(float a) {
        this.numeroA = a;
    }

    public void setNumeroB(float b) {
        this.numeroB = b;
    }

    public void setNumeroC(float c) {
        this.numeroC = c;
    }

    public float getMedia() {

        this.media = (this.numeroA+this.numeroB+this.numeroC)/3;

        return this.media;
    }

    public float achaMaiorNumero() {

        if (this.numeroA > this.numeroB) {
            if (this.numeroA > this.numeroC) {
                this.maiorNumero = this.numeroA;
            }
        } else if (this.numeroB > this.numeroC) {
            if (this.numeroB > this.numeroA) {
                this.maiorNumero = this.numeroB;
            }
        } else if (this.numeroC > this.numeroA) {
            if (this.numeroC > this.numeroB) {
                this.maiorNumero = this.numeroC;
            }
        }

        return this.maiorNumero;

    }

    public float achaMenorNumero() {
        if (this.numeroA < this.numeroB) {
            if (this.numeroA < this.numeroC) {
                this.menorNumero = this.numeroA;
            }
        } else if (this.numeroB < this.numeroC) {
            if (this.numeroB < this.numeroA) {
                this.menorNumero = this.numeroB;
            }
        } else if (this.numeroC < this.numeroA) {
            if (this.numeroC < this.numeroB) {
                this.menorNumero = this.numeroC;
            }
        }

        return this.menorNumero;
    }
}
