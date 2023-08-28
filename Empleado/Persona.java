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

    public int calcularEdad(){

        if(this.fechaNac!=null) {
            return this.fechaNac.cantDiasMes() / 365;
        }else{
            System.out.println("Sin calculo ");
            return 0;
        }

    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + this.nombres);
        System.out.println("Apellido: " + this.apellidos);

        if (this.nifPersona != null) {
            System.out.println("NIF: " + this.nifPersona.getNIF());
        } else {
            System.out.println("Todavía no tiene asignado un NIF");
        }

        System.out.println("Edad: " + this.calcularEdad());
    }





    public Persona(String nombrex, String apellidox, String nifX){
        this.nifPersona= new NIF(nifX);
        this.apellidos=apellidox;
        this.nombres=nombrex;
    }

    public Persona (String nombres, String aplellidos, NIF nifPersona, Fecha fechaNac) {
        this.nombres = nombres;
        this.apellidos = aplellidos;
        this.nifPersona = nifPersona;
        this.fechaNac = fechaNac;
    }


}

