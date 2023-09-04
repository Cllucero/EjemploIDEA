

package ClubSistemaDeAsistencia;

import java.time.LocalDate;
import java.util.ArrayList; // Importa la clase ArrayList

public class Jugador extends Persona implements Clima {
    private String apodo;
    private String nombreCompletoResponsable;
    private String movilContactoUnicoResponsable;
    //private ArrayList<Asistencia> presentes;

public Jugador (String nombresx, String apellidosx, String dnix, int diaNacx, int mesNacx, int anioNacx, String apodox, String nombreCompletoResponsablex, String movilContactoUnicoResponsablex){
    super( nombresx, apellidosx,  dnix, diaNacx , mesNacx , anioNacx);
    this.apodo=apodox;
    this.nombreCompletoResponsable=nombreCompletoResponsablex;
    this.movilContactoUnicoResponsable=movilContactoUnicoResponsablex;
    //this.presentes= new ArrayList<>();

    }



    @Override
    public double calcularClima() {
        return this.calcularPromedioClimaDesdePersona();
    }
    @Override
    public double calcularBorg() {
        return this.calcularPromedioBorgDesdePersona();
    }

    public double calcularAsistencia(){
    return this.cantidadAsistenciaDesdePersona();
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getNombreCompletoResponsable() {
        return nombreCompletoResponsable;
    }

    public void setNombreCompletoResponsable(String nombreCompletoResponsable) {
        this.nombreCompletoResponsable = nombreCompletoResponsable;
    }

    public String getMovilContactoUnicoResponsable() {
        return movilContactoUnicoResponsable;
    }

    public void setMovilContactoUnicoResponsable(String movilContactoUnicoResponsable) {
        this.movilContactoUnicoResponsable = movilContactoUnicoResponsable;
    }
}
