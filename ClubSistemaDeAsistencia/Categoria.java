

package ClubSistemaDeAsistencia;

import java.time.LocalDate;
import java.util.ArrayList;

public class Categoria {

    private String nombreEquipo;
    private int cantidadDeJugadores;
    private ArrayList<Jugador> equipo;
    private ArrayList<Formador> cuerpoTecnico;

    public Categoria (String nombreEquipox, int cantidadDeJugadoresx){
        this.nombreEquipo=nombreEquipox;
        this.cantidadDeJugadores=cantidadDeJugadoresx;
        this.equipo=new ArrayList<>();
        this.cuerpoTecnico=new ArrayList<>();

    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getCantidadDeJugadores() {
        return cantidadDeJugadores;
    }

    public void setCantidadDeJugadores(int cantidadDeJugadores) {
        this.cantidadDeJugadores = cantidadDeJugadores;
    }

    public ArrayList<Jugador> getEquipo() {
        return equipo;
    }

    public void setEquipo(Jugador jugadorx) {
        this.equipo.add(jugadorx);
    }

    public ArrayList<Formador> getCuerpoTecnico() {
        return cuerpoTecnico;
    }

    public void setCuerpoTecnico(Formador cuerpoTecnico) {
        this.cuerpoTecnico.add(cuerpoTecnico);
    }
}
