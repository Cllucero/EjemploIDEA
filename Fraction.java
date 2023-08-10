public class Fraction {

    private int numerador;
    private int denominador;

    public Fraction() {

    }
    public Fraction(int A , int B){
        if(B != 0) {
            this.denominador = B;
            this.numerador = A;
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


    public void simplificar() {
        int mcd = calcularMCD(numerador, denominador);
        numerador /= mcd;
        denominador /= mcd;
    }

    private static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }



}
