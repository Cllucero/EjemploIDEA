public class Fraccion {
    private int num;
    private int den;

    public Fraccion(int num, int den) {
        if (den == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero");
        }
        this.num = num;
        this.den = den;
    }

    public void simplificar() {
        int mcd = calcularMCD(num, den);
        num /= mcd;
        den /= mcd;
    }

    private static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public Fraccion suma(Fraccion other) {
        int nuevoNum = this.num * other.den + other.num * this.den;
        int nuevoDen = this.den * other.den;
        Fraccion nuevaFraccion = new Fraccion(nuevoNum, nuevoDen);
        nuevaFraccion.simplificar();
        return nuevaFraccion;
    }

    public Fraccion resta(Fraccion other) {
        int nuevoNum = this.num * other.den - other.num * this.den;
        int nuevoDen = this.den * other.den;
        Fraccion nuevaFraccion = new Fraccion(nuevoNum, nuevoDen);
        nuevaFraccion.simplificar();
        return nuevaFraccion;
    }

    public Fraccion multiplicacion(Fraccion other) {
        int nuevoNum = this.num * other.num;
        int nuevoDen = this.den * other.den;
        Fraccion nuevaFraccion = new Fraccion(nuevoNum, nuevoDen);
        nuevaFraccion.simplificar();
        return nuevaFraccion;
    }

    public Fraccion division(Fraccion other) {
        if (other.num == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        int nuevoNum = this.num * other.den;
        int nuevoDen = this.den * other.num;
        Fraccion nuevaFraccion = new Fraccion(nuevoNum, nuevoDen);
        nuevaFraccion.simplificar();
        return nuevaFraccion;
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }

    public static void main(String[] args) {
        Fraccion fraccion1 = new Fraccion(3, 4);
        Fraccion fraccion2 = new Fraccion(1, 2);

        Fraccion suma = fraccion1.suma(fraccion2);
        Fraccion resta = fraccion1.resta(fraccion2);
        Fraccion producto = fraccion1.multiplicacion(fraccion2);
        Fraccion division = fraccion1.division(fraccion2);

        System.out.println("Fracción 1: " + fraccion1);
        System.out.println("Fracción 2: " + fraccion2);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + producto);
        System.out.println("División: " + division);
    }
}
