

package ClubSistemaDeAsistencia;

import java.util.ArrayList;

public class Categoria implements Clima {

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

    @Override
    public double calcularClima() {
        double aux=0.0;

        for(int i=0;i<equipo.size();i++){
           aux= this.equipo.get(i).calcularPromedioClimaDesdePersona()+aux;
        }
        return aux;
        }

    @Override
    public double calcularBorg() {
        double aux=0.0;

        for(int i=0;i<equipo.size();i++){
            aux= this.equipo.get(i).calcularPromedioBorgDesdePersona()+aux;
        }
        return aux;
    }

    public ArrayList<Object> calcularAsistencia(){
        int maximaAsistencia = 1;


        ArrayList<Object> listaDeDuplasPromedio = new ArrayList<>();
        String jugador;  //aux para sacar el apodo de jugaor
        double promedio=0.0; // aux para sacar el promedio


        // calcula la max cantidad de asistencia por Equipo para el promedio
        for(int i=0;i<equipo.size();i++){

            if ( maximaAsistencia < this.equipo.get(i).cantidadAsistenciaDesdePersona()){
                maximaAsistencia=this.equipo.get(i).cantidadAsistenciaDesdePersona();
            }
        System.out.println("La Maxima cantidad de Asistencia es "+maximaAsistencia);
        }

        // calcula por cada jugador el promedio de asistencia total
        for(int i=0;i<equipo.size();i++){

            if ( this.equipo.get(i).cantidadAsistenciaDesdePersona() < maximaAsistencia){


                ArrayList<Object> duplaJugadorAliasPromedio= new ArrayList<>();
                jugador= this.equipo.get(i).getApodo();
                promedio= (this.equipo.get(i).cantidadAsistenciaDesdePersona()/cantidadDeJugadores);
                duplaJugadorAliasPromedio.add(jugador);
                duplaJugadorAliasPromedio.add(promedio);
                listaDeDuplasPromedio.add(duplaJugadorAliasPromedio);
            }

        }


        return listaDeDuplasPromedio;

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
