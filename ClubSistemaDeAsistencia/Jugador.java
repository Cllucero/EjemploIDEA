

package ClubSistemaDeAsistencia;

import java.time.LocalDate;
import java.util.ArrayList; // Importa la clase ArrayList

public class Jugador extends Persona {
    private String enfermedadCronica;
    private String medicacionCronica;
    private String consideracionMedicas;
    private ResponsableMenor responsableMenor = new ResponsableMenor();
    private ArrayList<Asistencia> asistencias; // ArrayList para almacenar asistencias

    public Jugador(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String dni, String alias, LocalDate fechaNacimiento, String enfermedadCronica, String medicacionCronica, String consideracionMedicas) {
        super(primerNombre, segundoNombre, primerApellido, segundoApellido, dni, alias, fechaNacimiento);
        this.enfermedadCronica = enfermedadCronica;
        this.medicacionCronica = medicacionCronica;
        this.consideracionMedicas = consideracionMedicas;

        this.asistencias = new ArrayList<>(); // Inicializa el ArrayList en el constructor
    }

    public void agregarResponsableMenor(String firmaNombreCompletox, String dniResponsablex, String numeroContactoUnicox, boolean autRedesx, boolean autEstadx) {
        //this.responsableMenor = new ResponsableMenor(firmaNombreCompletox, dniResponsablex, numeroContactoUnicox, autRedesx, autEstadx);

        this.responsableMenor.setFirmaNombreCompleto(firmaNombreCompletox);
        this.responsableMenor.setDniResponsable(dniResponsablex);
        this.responsableMenor.setNumeroContactoUnico(numeroContactoUnicox);
        this.responsableMenor.setAutorizacionRedes(autRedesx);
        this.responsableMenor.setAutorizacionEsdisticas(autEstadx);

    }

    public void agregarAsistencia(int climaJugx, int borgx) {
        if (climaJugx != 0 && borgx != 0) {
            this.asistencias.add(new Asistencia(climaJugx, borgx)); // Agrega la asistencia al ArrayList
        }
    }

    public String getEnfermedadCronica() {
        return enfermedadCronica;
    }

    public void setEnfermedadCronica(String enfermedadCronica) {
        this.enfermedadCronica = enfermedadCronica;
    }

    public String getMedicacionCronica() {
        return medicacionCronica;
    }

    public void setMedicacionCronica(String medicacionCronica) {
        this.medicacionCronica = medicacionCronica;
    }

    public String getConsideracionMedicas() {
        return consideracionMedicas;
    }

    public void setConsideracionMedicas(String consideracionMedicas) {
        this.consideracionMedicas = consideracionMedicas;
    }

    public ResponsableMenor getResponsableMenor() {
        return responsableMenor;
    }

    public void setResponsableMenor(ResponsableMenor responsableMenor) {
        this.responsableMenor = responsableMenor;
    }

    public ArrayList<Asistencia> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(ArrayList<Asistencia> asistencias) {
        this.asistencias = asistencias;
    }
}
