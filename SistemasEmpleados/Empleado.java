
package SistemasEmpleados;

public class Empleado {
    private String nombre;
    private double sueldoBase;


    public double calcularSalario(){
        return sueldoBase;
    }



    public Empleado(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSuledoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double suledoBase) {
        this.sueldoBase = suledoBase;
    }
}
