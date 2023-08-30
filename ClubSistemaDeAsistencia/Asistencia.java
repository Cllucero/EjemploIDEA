// Es para registrar la relacion de asistencia, de aqui deberia poder calcular las estadisticas
package ClubSistemaDeAsistencia;

import java.time.LocalDate;

public class Asistencia {
    private String idCodAsistencia;
    private LocalDate fechaAsist;
    private int climaJugadorInicio;
    private int cargaBorgEstimada;


    public Asistencia( int climaJugadorInicio, int cargaBorgEstimada) {
        this.fechaAsist = LocalDate.now();
        this.climaJugadorInicio = climaJugadorInicio;
        this.cargaBorgEstimada = cargaBorgEstimada;
        this.idCodAsistencia=LocalDate.now().toString();
    }

    public String getIdCodAsistencia() {
        return idCodAsistencia;
    }

    public void setIdCodAsistencia(String idCodAsistencia) {
        this.idCodAsistencia = idCodAsistencia;
    }

    public LocalDate getFechaAsist() {
        return fechaAsist;
    }

    public void setFechaAsist(LocalDate fechaAsist) {
        this.fechaAsist = fechaAsist;
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
