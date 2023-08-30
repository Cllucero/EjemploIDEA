

package ClubSistemaDeAsistencia;

import java.time.LocalDate;
import java.util.ArrayList;

public class Categoria {

    private ArrayList<Persona> equipo;
    private Persona formador ;
    private String idCategoria;
    private String nombreCategoria;
    private String descripcion;
    private boolean disponible;

    public Categoria(String nombreCategoria, String descripcion) {
        this.nombreCategoria = nombreCategoria;
        this.descripcion = descripcion;
        this.idCategoria = nombreCategoria;
        this.disponible = true;

        this.equipo = new ArrayList<>();
        this.formador = null; // Inicializa el formador como null
    }

    public void agregarJugador(String primerNombrex, String segundoNombrex, String primerApellidox, String segundoApellidox, String dnix, String aliasx, int diaxx, int mesxx, int anioxx, String enfermedadCronicax, String medicacionCronicax, String consideracionMedicasx) {
        LocalDate fechaNacimientox = LocalDate.of(anioxx, mesxx, diaxx);
        //Jugador agregardo = new Jugador(primerNombrex, segundoNombrex, primerApellidox, segundoApellidox, dnix, aliasx, fechaNacimientox, enfermedadCronicax, medicacionCronicax, consideracionMedicasx);
        this.equipo.add(new Jugador(primerNombrex, segundoNombrex, primerApellidox, segundoApellidox, dnix, aliasx, fechaNacimientox, enfermedadCronicax, medicacionCronicax, consideracionMedicasx));
    }
    public void agregarJugador(Jugador jx){
        this.equipo.add(jx);
    }


    public ArrayList<Persona> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Persona> equipo) {
        this.equipo = equipo;
    }

    public Persona getFormador() {
        return formador;
    }

    public void setFormador(Persona formador) {
        this.formador = formador;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
