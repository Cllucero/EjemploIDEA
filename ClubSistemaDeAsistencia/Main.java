/*
Mis disculpas si la representación no fue clara. Intentaré proporcionar una descripción textual más detallada de las relaciones entre las clases:

1. **Persona**
   - Atributos: idPersona, fechaAlta, primerNombre, segundoNombre, primerApellido, segundoApellido, dni, alias, fechaNacimiento
   - Métodos: getters y setters para cada atributo

2. **Formador**
   - Hereda de: Persona
   - Atributos adicionales: idFormador, numeroUEFA
   - Métodos adicionales: getters y setters para idFormador y numeroUEFA

3. **Categoria**
   - Atributos: equipo (ArrayList<Persona>), formador (Persona), idCategoria, nombreCategoria, descripcion, disponible
   - Métodos: agregarJugador(String,...) y agregarJugador(Jugador), getters y setters para los atributos

4. **Jugador**
   - Hereda de: Persona
   - Atributos adicionales: enfermedadCronica, medicacionCronica, consideracionMedicas, responsableMenor (ResponsableMenor), asistencias (ArrayList<Asistencia>)
   - Métodos adicionales: agregarResponsableMenor(String,...), agregarAsistencia(int,...), getters y setters para los atributos

5. **ResponsableMenor**
   - Atributos: idResponsableMenor, firmaNombreCompleto, dniResponsable, numeroContactoUnico, autorizacionRedes, autorizacionEsdisticas
   - Métodos: getters y setters para los atributos

Cada clase `Persona`, `Formador`, `Categoria`, `Jugador` y `ResponsableMenor` tiene atributos y métodos propios, y algunas de ellas heredan atributos y métodos de la clase `Persona`. La clase `Categoria` tiene una relación de composición con `Persona` (equipo) y `Persona` (formador), y la clase `Jugador` tiene una relación de composición con `ResponsableMenor` y una relación de composición con `Asistencia`.

 */






package ClubSistemaDeAsistencia;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Crea un ArrayList de jugadores
        ArrayList<Jugador> jugadores = new ArrayList<>();

        // Crea 10 jugadores
        for (int i = 1; i <= 10; i++) {
            Jugador jugador = new Jugador("Jugador " + i, "Pérez", "12345678A", 1, 1, 1, "Juanito", "Juan Pérez", "666666666");
            jugadores.add(jugador);
        }

        // Agrega asistencias a los jugadores
        for (Jugador jugador : jugadores) {
            int numeroAsistencias = (int) (Math.random() * 10);
            for (int j = 1; j <= numeroAsistencias; j++) {
                int borg = (int) (Math.random() * 10);
                int climaJugador = (int) (Math.random() * 10);
                jugador.agregarPresente(borg, climaJugador);
            }
        }

        // Calcula la asistencia promedio para cada jugador
        for (Jugador jugador : jugadores) {
            double asistenciaPromedio = jugador.calcularAsistencia();
            System.out.println("La asistencia promedio del jugador " + jugador.getNombres() + " es " + asistenciaPromedio);
        }

    }

}









