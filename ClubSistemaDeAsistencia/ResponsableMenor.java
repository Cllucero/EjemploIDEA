// clase ResponsableMenor es para dejar constancia quien es el que autoriza el uso de datos
// y que numero de contacto UNICO para urgencia le corresponde
package ClubSistemaDeAsistencia;

import java.time.LocalDate;

public class ResponsableMenor {
    private String idResponsableMenor;
    private String firmaNombreCompleto;
    private String dniResponsable;
    private String numeroContactoUnico;
    private boolean autorizacionRedes;
    private boolean autorizacionEsdisticas;


    public ResponsableMenor(String firmaNombreCompleto, String dniResponsable, String numeroContactoUnico, boolean autorizacionRedes, boolean autorizacionEsdisticas) {
        this.idResponsableMenor=numeroContactoUnico;
        this.firmaNombreCompleto = firmaNombreCompleto;
        this.dniResponsable = dniResponsable;
        this.numeroContactoUnico = numeroContactoUnico;
        this.autorizacionRedes = autorizacionRedes;
        this.autorizacionEsdisticas = autorizacionEsdisticas;
    }

    public ResponsableMenor() {
    }

    public String getFirmaNombreCompleto() {
        return firmaNombreCompleto;
    }

    public void setFirmaNombreCompleto(String firmaNombreCompleto) {
        this.firmaNombreCompleto = firmaNombreCompleto;
    }

    public String getDniResponsable() {
        return dniResponsable;
    }

    public void setDniResponsable(String dniResponsable) {
        this.dniResponsable = dniResponsable;
    }

    public String getNumeroContactoUnico() {
        return numeroContactoUnico;
    }

    public void setNumeroContactoUnico(String numeroContactoUnico) {
        this.numeroContactoUnico = numeroContactoUnico;
    }

    public boolean isAutorizacionRedes() {
        return autorizacionRedes;
    }

    public void setAutorizacionRedes(boolean autorizacionRedes) {
        this.autorizacionRedes = autorizacionRedes;
    }

    public boolean isAutorizacionEsdisticas() {
        return autorizacionEsdisticas;
    }

    public void setAutorizacionEsdisticas(boolean autorizacionEsdisticas) {
        this.autorizacionEsdisticas = autorizacionEsdisticas;
    }
}
