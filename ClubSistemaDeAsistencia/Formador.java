package ClubSistemaDeAsistencia;

import java.time.LocalDate;

public class Formador extends Persona implements Clima{

   private String numeroCarnetUEFA;
   private int movilContactoUnico;

   public Formador(String nombresx, String apellidosx, String dnix, int diaNac, int mesNac, int anioNac, String nCarnetUEFA,int movilCU){
       super( nombresx, apellidosx, dnix, diaNac, mesNac, anioNac);
       this.numeroCarnetUEFA=nCarnetUEFA;
       this.movilContactoUnico=movilCU;
   }

    @Override
    public double calcularClima() {
        return calcularPromedioClimaDesdePersona();
    }

    @Override
    public double calcularBorg() {
        return calcularPromedioBorgDesdePersona();
    }

    public double calcularAsistencia(){
        return this.cantidadAsistenciaDesdePersona();
    }

    public String getNumeroCarnetUEFA() {
        return numeroCarnetUEFA;
    }

    public void setNumeroCarnetUEFA(String numeroCarnetUEFA) {
        this.numeroCarnetUEFA = numeroCarnetUEFA;
    }

    public int getMovilContactoUnico() {
        return movilContactoUnico;
    }

    public void setMovilContactoUnico(int movilContactoUnico) {
        this.movilContactoUnico = movilContactoUnico;
    }
}
