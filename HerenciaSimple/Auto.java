package HerenciaSimple;// Ejercicio 1 - Herencia Simple:
//
//Crea dos clases: HerenciaSimple.Vehiculo y HerenciaSimple.Auto. La clase HerenciaSimple.Vehiculo debe tener atributos como marca,
// modelo y métodos como arrancar() y detenerse().
// La clase HerenciaSimple.Auto debe heredar de HerenciaSimple.Vehiculo y tener un atributo adicional numPuertas y
// un método mostrarDetalles() que muestre la marca, modelo y número de puertas del auto.

public class Auto extends Vehiculo {
    private int numPuerta;
    private String color;
    private int ph;
    private int km;


    public Auto(String marcax, int modelox, int numPuertax, String colorx, int phx, int kmx) {
        super(marcax, modelox);
        this.numPuerta = numPuertax;
        this.color = colorx;
        this.ph = phx;
        this.km = kmx;
    }

    public void mostrarDetalles(){
        System.out.println(" Marca "+this.getMarca()+" Modelo "+this.getModelo()+" NumeroPuertas "+this.getNumPuerta());
        System.out.println(" Color "+this.getColor()+" PotenciaDelMotor "+this.getPh()+" Km "+this.getKm());
    }

    public int getNumPuerta() {
        return numPuerta;
    }

    public void setNumPuerta(int numPuerta) {
        this.numPuerta = numPuerta;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPh() {
        return ph;
    }

    public void setPh(int ph) {
        this.ph = ph;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}
