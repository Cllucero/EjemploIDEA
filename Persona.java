/*
1. Crea una clase Persona.
La clase contendrá un atributo fechaNacimiento que será un objeto de la clase Fecha creada en el ejercicio 6 anterior.
 */
public class Persona {
    private String nombres;
    private String aplellidos;
    private final NIF nifPersona;
    private Fecha fechaNac;

    public Persona(String nombres, String aplellidos, NIF nifPersona, Fecha fechaNac) {
        this.nombres = nombres;
        this.aplellidos = aplellidos;
        this.nifPersona = nifPersona;
        this.fechaNac = fechaNac;
    }

    public static final void mostrarDetalles(Persona persona) {
        System.out.println("Nombre: " + persona.nombres);
        System.out.println("Apellidos: " + persona.aplellidos);
        System.out.println("NIF: " + persona.nifPersona.getNumero());
        System.out.println("Fecha de Nacimiento: " + persona.fechaNac);
    }

    public static void main(String[] args) {
        Fecha fechaNacimiento = new Fecha(1990, 5, 15); // Suponiendo que tienes una clase Fecha similar a la del ejercicio 6
        NIF nif = new NIF(12345678); // Suponiendo que tienes una clase NIF

        Persona persona = new Persona("Juan", "Perez", nif, fechaNacimiento);
        Persona.mostrarDetalles(persona);
    }
}

