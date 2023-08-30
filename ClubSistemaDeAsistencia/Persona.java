// la clase persona es para poder persistir datos simple
package ClubSistemaDeAsistencia;
import java.time.*;
import java.time.LocalDate;
import java.util.ArrayList;
public class Persona {


    private String idPersona;
    private LocalDate fechaAlta;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String dni;
    private String alias;
    private LocalDate fechaNacimiento;

    public Persona(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String dni, String alias, LocalDate fechaNacimiento) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.dni = dni;
        this.alias = alias;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaAlta= LocalDate.now();
        this.idPersona= dni;
    }




    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
