
package SistemasEmpleados;

public class Gerente extends Empleado implements PuedeGestionar {
    private double bono;

    public Gerente(String nombre, double suledoBase, double bono) {
        super(nombre, suledoBase);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }



    public double calcularSalario(){
        //System.out.println(this.getSuledoBase()+this.getBono());
        return this.getSuledoBase()+this.getBono();
    }


    @Override
    public void gestionar() {
        this.setBono(this.getBono()+1);
    System.out.println("estoy empezando a operar");
    }
}



