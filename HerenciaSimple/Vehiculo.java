package HerenciaSimple;// Ejercicio 1 - Herencia Simple:
//
//Crea dos clases: HerenciaSimple.Vehiculo y HerenciaSimple.Auto. La clase HerenciaSimple.Vehiculo debe tener atributos como marca,
// modelo y métodos como arrancar() y detenerse().
// La clase HerenciaSimple.Auto debe heredar de HerenciaSimple.Vehiculo y tener un atributo adicional numPuertas y
// un método mostrarDetalles() que muestre la marca, modelo y número de puertas del auto.

public class Vehiculo {
    private String marca;
    private int modelo;
    private boolean estadoMotor;

    public Vehiculo (String marcax, int modelox){
        this.estadoMotor=true;
        this.marca=marcax;
        this.modelo=modelox;
    }


    public void arrancar(){
        this.setEstadoMotor(true);
    }

    public void detener(){
        this.setEstadoMotor(false);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public boolean getEstadoMotor() {
        return estadoMotor;
    }

    public void setEstadoMotor(boolean estadoMotor) {
        this.estadoMotor = estadoMotor;
    }
}
