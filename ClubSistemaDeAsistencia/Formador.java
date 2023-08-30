package ClubSistemaDeAsistencia;

import java.time.LocalDate;

public class Formador extends Persona {

    private String idFormador="00";
    private String numeroUEFA="00";

    public Formador(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String dni, String alias, int diax, int mesx, int aniox,String numeroUEFA) {

        super(primerNombre, segundoNombre, primerApellido, segundoApellido, dni, alias, LocalDate.of(aniox,mesx,diax));
        this.numeroUEFA = numeroUEFA;
    }

    public Formador(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String dni, String alias, LocalDate fechaNacimiento) {
   super(primerNombre, segundoNombre, primerApellido, segundoApellido, dni, alias, fechaNacimiento);
   }

    public String getIdFormador() {
        return idFormador;
    }

    public void setIdFormador(String idFormador) {
        this.idFormador = idFormador;
    }

    public String getNumeroUEFA() {
        return numeroUEFA;
    }

    public void setNumeroUEFA(String numeroUEFA) {
        this.numeroUEFA = numeroUEFA;
    }
}
