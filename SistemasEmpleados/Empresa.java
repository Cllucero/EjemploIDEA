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

import javax.swing.text.Style;

public class Empresa {

    private String nombre="";
    private int cantMaxEmpl=0;
    private int cantActEmpl;
    private Empleado plantillaEmpledos[];

    public Empresa(String nombrex, int cantMaxEmplx){
        this.nombre=nombrex;
        this.plantillaEmpledos= new Empleado[cantMaxEmplx];
        this.cantActEmpl=0;
        this.cantMaxEmpl=cantMaxEmplx;
    }

    public void agregarEmpleado(Empleado nuevox){
        if(this.cantMaxEmpl>this.cantActEmpl) {
            this.plantillaEmpledos[this.cantActEmpl] = nuevox;
            this.setCantActEmpl(this.cantActEmpl + 1);
            System.out.println("Actualmente la cantidad de Empleados es: " + this.getCantActEmpl() + " su capacidad Maxima de Empleado es: "
            +this.cantMaxEmpl);
        }
        else{
            System.out.println("no cumplio los requisitos de cantidad de empleados");
        }
    }

    public double calcularPagosTotalAEmpleados(){
        double aux=0;

        for(int i=0;i<this.cantActEmpl;i++){
            System.out.println(i);
            aux= this.plantillaEmpledos[i].calcularSalario()+aux;
            System.out.println("El pago parcial de todos los empleados es: "+aux);
        }
        System.out.println("El pago de todos los empleados es: "+aux);
         return aux;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantMaxEmpl() {
        return cantMaxEmpl;
    }

    public void setCantMaxEmpl(int cantMaxEmpl) {
        this.cantMaxEmpl = cantMaxEmpl;
    }

    public int getCantActEmpl() {
        return cantActEmpl;
    }

    public void setCantActEmpl(int cantActEmpl) {
        this.cantActEmpl = cantActEmpl;
    }
}
