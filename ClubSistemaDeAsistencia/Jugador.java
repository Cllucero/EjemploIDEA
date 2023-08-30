

package ClubSistemaDeAsistencia;

import java.time.LocalDate;
import java.util.ArrayList; // Importa la clase ArrayList

public class Jugador extends Persona implements Clima {
    private String apodo;
    private String nombreCompletoResponsable;
    private String movilContactoUnicoResponsable;
    private ArrayList<Asistencia> presentes;

public Jugador (String nombresx, String apellidosx, String dnix, int diaNacx, int mesNacx, int anioNacx, String apodox, String nombreCompletoResponsablex, String movilContactoUnicoResponsablex){
    super( nombresx, apellidosx,  dnix, diaNacx , mesNacx , anioNacx);
    this.apodo=apodox;
    this.nombreCompletoResponsable=nombreCompletoResponsablex;
    this.movilContactoUnicoResponsable=movilContactoUnicoResponsablex;
    this.presentes= new ArrayList<>();

    }

    public void agregarPresente (int climaJugadorIniciox, int cargaBorgEstimadax){
        this.presentes.add(new Asistencia(climaJugadorIniciox,cargaBorgEstimadax));
    }

    @Override
    public double calcularClima() {
        int aux=0;
        for(int i =0; i<presentes.size(); i++){

        aux = presentes.get(i).getClimaJugadorInicio()+ aux;

        }

        return aux/presentes.size();
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
