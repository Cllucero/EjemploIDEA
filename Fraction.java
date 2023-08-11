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

    public Fraction sumaFract (Fraction factB) {


        int numerador;
        int denominador;


        numerador = (this.numerador * factB.denominador) + (this.denominador * factB.numerador);
        denominador = this.denominador*factB.denominador;
        return new Fraction(numerador, denominador);

    }
    public Fraction restFract (Fraction factB) {


        int numerador;
        int denominador;

        numerador = (this.numerador * factB.denominador) - (this.denominador * factB.numerador);
        denominador = this.denominador*factB.denominador;
        return new Fraction(numerador, denominador);

    }

    public Fraction productoFract (Fraction factB) {


        int numerador;
        int denominador;


        numerador = (this.numerador * factB.numerador);
        denominador = this.denominador*factB.denominador;
        return new Fraction(numerador, denominador);

    }

    public Fraction divFract (Fraction factB) {

        if(factB.denominador!=0) {
            int numerador;
            int denominador;
        }
        else
        {
            System.out.println("su denominador no es valido , debe ser direfente a x");
        }

        numerador = (this.numerador * factB.denominador);
        denominador = this.denominador*factB.numerador;
        return new Fraction(numerador, denominador);

    }

    //////////////////////////////////////////////
    public static void main(String[] args) {

        Fraction prueba1 = new Fraction(10,5);
        Fraction prueba2 = new Fraction(2,4);

        Fraction suma = prueba1.sumaFract(prueba2);
        Fraction resta = prueba1.restFract(prueba2);
        Fraction producto = prueba1.productoFract(prueba2);
        Fraction division = prueba1.divFract(prueba2);


        System.out.println("Fracción 1: " + prueba1.numerador+"/"+prueba1.denominador);
        System.out.println("Fracción 2: " + prueba2.numerador+"/"+prueba2.denominador);
        System.out.println("Suma: " + suma.numerador+"/"+suma.denominador);
        System.out.println("Resta: " + resta.numerador+"/"+resta.denominador);
        System.out.println("Producto: " + producto.numerador+"/"+producto.denominador);
        System.out.println("División: " + division.numerador+"/"+division.denominador);
    }

    }
