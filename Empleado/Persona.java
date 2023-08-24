package Empleado;

/*
1. Crea una clase Empleado.Empleado.Persona.
La clase contendrá un atributo fechaNacimiento que será un objeto de la clase Empleado.Empleado.Fecha creada en el ejercicio 6 anterior.
 */
public class Persona {
    private String nombres;
    private String apellidos;
    private final NIF nifPersona;
    private Fecha fechaNac;


    public Persona(String nombrex, String apellidox, String nifX){
        this.nifPersona= new NIF(nifX);
        this.apellidos=apellidox;
        this.nombres=nombrex;
    }

    public Persona(String nombres, String aplellidos, NIF nifPersona, Fecha fechaNac) {
        this.nombres = nombres;
        this.apellidos = aplellidos;
        this.nifPersona = nifPersona;
        this.fechaNac = fechaNac;
    }


}

