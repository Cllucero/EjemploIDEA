// Es para registrar la relacion de asistencia, de aqui deberia poder calcular las estadisticas
package ClubSistemaDeAsistencia;

import java.time.LocalDate;

public class Asistencia {

    private LocalDate fechaAsist;
    private int climaJugadorInicio;
    private int cargaBorgEstimada;


    public Asistencia( int climaJugadorIniciox, int cargaBorgEstimadax) {
        this.fechaAsist = LocalDate.now();
        this.climaJugadorInicio = climaJugadorIniciox;
        this.cargaBorgEstimada = cargaBorgEstimadax;

    }


    public LocalDate getFechaAsist() {
        return fechaAsist;
    }

    public void setFechaAsist(int diax, int mesx, int aniox) {

        this.fechaAsist = LocalDate.of(aniox,mesx,diax);
    }

    public int getClimaJugadorInicio() {
        return climaJugadorInicio;
    }

    public void setClimaJugadorInicio(int climaJugadorInicio) {
        this.climaJugadorInicio = climaJugadorInicio;
    }

    public int getCargaBorgEstimada() {
        return cargaBorgEstimada;
    }

    public void setCargaBorgEstimada(int cargaBorgEstimada) {
        this.cargaBorgEstimada = cargaBorgEstimada;
    }



}

