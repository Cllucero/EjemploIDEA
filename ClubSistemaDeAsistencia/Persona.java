// la clase persona es para poder persistir datos simple
package ClubSistemaDeAsistencia;
import java.time.*;
import java.time.LocalDate;
import java.util.ArrayList;
public class Persona {

    private String nombres;
    private String apellidos;
    private String dni;
    private LocalDate fechaNacimiento;
    private ArrayList<Asistencia> presentes;

    public Persona (String nombresx, String apellidosx, String dnix, int diaNac, int mesNac, int anioNac){
        this.nombres=nombresx;
        this.apellidos= apellidosx;
        this.dni=dnix;
        this.fechaNacimiento= LocalDate.of(anioNac,mesNac,diaNac);
        this.presentes= new ArrayList<>();
    }

    public void agregarPresente (int climaJugadorIniciox, int cargaBorgEstimadax){
        this.presentes.add(new Asistencia(climaJugadorIniciox,cargaBorgEstimadax));
    }

    public double calcularPromedioClimaDesdePersona(){
        double aux=0;
        for(int i =0; i<this.presentes.size(); i++){

            aux = this.presentes.get(i).getClimaJugadorInicio()+ aux;

        }
        return aux / (presentes.size());
    }

    public double calcularPromedioBorgDesdePersona(){
        double aux=0;
        for(int i =0; i<this.presentes.size(); i++){

            aux = this.presentes.get(i).getCargaBorgEstimada()+ aux;

        }
        return aux / (presentes.size());
    }

    public int cantidadAsistenciaDesdePersona(){
        return this.presentes.size();
    }



    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
