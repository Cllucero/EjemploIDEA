package Herencia;

import Herencia.Animal;
import Herencia.Corredor;
import Herencia.Nadador;

//Ejercicio 2 - Herencia Múltiple:
//
//Crea tres interfaces: Herencia.Volador, Herencia.Nadador y Herencia.Corredor. Luego, crea una clase Herencia.Animal con atributos
// como nombre y métodos como comer() y descansar(). Luego, crea una clase Herencia.Delfin que implemente
// las interfaces Herencia.Nadador y Herencia.Corredor, y una clase Herencia.Aguila que implemente las interfaces Herencia.Volador y Herencia.Corredor.
// Ambas clases deben heredar de Herencia.Animal.
//
//Nota: Las interfaces Herencia.Volador, Herencia.Nadador y Herencia.Corredor no necesitan tener métodos,
// ya que en este ejercicio funcionan como marcadores para indicar las habilidades de las
// clases Herencia.Delfin y Herencia.Aguila.
public class Delfin extends Animal implements Nadador, Corredor {

    public Delfin(String nombrex, boolean accion) {
        super(nombrex, accion);
    }

}
