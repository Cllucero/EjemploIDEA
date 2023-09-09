package PracticasCursoUdemi.Exception;

import java.io.IOException;

public class Suma {
    public Suma() {
    }


    //Los números enteros abarcan a los números naturales (los que se utilizan para contar los elementos de un conjunto),
    // incluyendo al cero y a los números negativos (que son el resultado de restar a un número natural otro mayor). Por lo tanto,
    // los números enteros son aquellos que no tienen parte decimal (es decir que 3,28, por ejemplo, no es un número entero).


    public int sumarEnteros(int xx, int yy) {

        try {
            System.out.println("Operacion Suma entre Enteros");
            System.out.println();
            System.out.println("Se han ingresado estos dos numeros: " + xx + " y " + yy);
            System.out.println("La suma de ambos es :" + (xx + yy));
            return xx + yy;

        } catch (Exception e) {
            System.out.println("error por puntero nulo");
            return 0;
        }



    }
}
