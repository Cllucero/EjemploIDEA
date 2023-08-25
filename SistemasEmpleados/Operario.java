package SistemasEmpleados;

public class Operario extends Empleado implements PuedeOperar {
    private int horaTrabajadas;


    public Operario(String nombre, double suledoBase, int horaTrabajadas) {
        super(nombre, suledoBase);
        this.horaTrabajadas = horaTrabajadas;
    }


    public int getHoraTrabajadas() {
        return horaTrabajadas;
    }

    public void setHoraTrabajadas(int horaTrabajadas) {
        this.horaTrabajadas = horaTrabajadas;
    }

    public double calcularSalario(){
        //System.out.println( this.getHoraTrabajadas()*(this.getSuledoBase()/28));
        return this.getHoraTrabajadas()*(this.getSuledoBase()/28);
    }


    @Override
    public void operar() {
        this.setHoraTrabajadas(this.getHoraTrabajadas()+1);
        System.out.println("estoy empenzando a operar");
    }
}
