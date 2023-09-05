package PracticasCursoUdemi.Matematica;

public class Factorial {

    public int factorialPorRecursivo(int x) {
        int factorialAnterior = 1;

        if (x == 0) {
            return 1;
        } else {
            factorialAnterior = factorialPorRecursivo(x - 1);
            return x * factorialAnterior;
        }
    }


    public int factorialPorIterativos(int x) {
        int factorial = 1;

        for (int i = 1; i <= x; i++) {
            factorial *= i;
        }

        return factorial;
    }

}