//Ejercicio - Sistema de Empleados:
//
//Crea un sistema para administrar empleados en una empresa. Deberás utilizar conceptos de herencia, interfaces y polimorfismo.
//
//Crea una clase base llamada Empleado, con los siguientes atributos:
//
//nombre (String)
//sueldoBase (double)
//Además, implementa los siguientes métodos:
//
//calcularSalario(): Calcula y devuelve el salario del empleado.
//Crea dos clases que hereden de Empleado:
//
//Gerente: Tiene un atributo adicional bono (double) y un método para calcular el salario que incluya el bono.
//Operario: Tiene un atributo adicional horasTrabajadas (int) y un método para calcular el salario que se basa en el sueldo base y las horas trabajadas.
//Crea una interfaz llamada PuedeGestionar con el método gestionar(). La clase Gerente debe implementar esta interfaz.
//
//Crea una interfaz llamada PuedeOperar con el método operar(). La clase Operario debe implementar esta interfaz.
//
//Crea una clase Empresa que contenga un array de objetos Empleado. Implementa un método para calcular la suma total de salarios de todos los empleados.
//
//En el método main, crea objetos de tipo Gerente y Operario, y agrega algunos empleados a la instancia de Empresa. Luego, muestra los salarios y verifica si algún empleado puede gestionar u operar.



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
