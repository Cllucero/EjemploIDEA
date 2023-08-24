package Herencia;

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
public class Animal {
    private String nombre;
    private boolean estadoAnimal;

    public Animal (String nombrex, boolean accion){
        this.nombre=nombrex;
        this.estadoAnimal=accion;
    }

    public void comer(){
        this.setEstadoAnimal(true);
        System.out.println(" El Herencia.Animal "+getNombre()+" esta comiendo");
    }

    public void dormir(){
        this.setEstadoAnimal(false);
        System.out.println(" El Herencia.Animal "+getNombre()+" esta durmiendo");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstadoAnimal() {
        return estadoAnimal;
    }

    public void setEstadoAnimal(boolean estadoAnimal) {
        this.estadoAnimal = estadoAnimal;
    }
}


