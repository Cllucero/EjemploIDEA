public class Fraction {

    private int numerador;
    private int denominador;

    public Fraction() {

    }
    public Fraction(int A , int B){
        if(B != 0) {
            this.denominador = A;
            this.numerador = B;
        }
        else
        {
            System.out.println("Su denominador es 0");
        }
    }

    public void setNumerador(int A){
        this.numerador=A;
    }

    public int getNumerador() {
        return this.numerador;
    }

    public void setDenominador(int B) {
        this.denominador=B;
    }

    public int getDenominador(){
        return this.denominador;
    }

    private static int MCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
