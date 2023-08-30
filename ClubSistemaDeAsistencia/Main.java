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

public class Main {

    public static void main(String[] args) {
        // Crear un formador
        Formador formador = new Formador("Juan", null, "Perez", null, "12345678", "jperez", 19,05, 1984, "UEFA123");

        // Crear 5 jugadores
        Jugador jugador1 = new Jugador("Ana", null, "Garcia", null, "11111111", "agarcia", LocalDate.of(2000, 3, 20), "Ninguna", "Ninguna", "Ninguna");
        Jugador jugador2 = new Jugador("Luis", null, "Lopez", null, "22222222", "llopez", LocalDate.of(2001, 7, 10), "Alergias", "MedicamentoX", "Ninguna");
        Jugador jugador3 = new Jugador("Maria", null, "Martinez", null, "33333333", "mmartinez", LocalDate.of(2002, 1, 5), "Asma", "InhaladorY", "Ninguna");
        Jugador jugador4 = new Jugador("Pedro", null, "Sanchez", null, "44444444", "psanchez", LocalDate.of(2003, 9, 8), "Ninguna", "Ninguna", "AlergiaGrave");
        Jugador jugador5 = new Jugador("Laura", null, "Ramirez", null, "55555555", "lramirez", LocalDate.of(2004, 12, 18), "Ninguna", "Ninguna", "Ninguna");

        // Agregar los jugadores al equipo de la categoría
        Categoria categoria = new Categoria("Sub-17", "Categoría para menores de 17 años");
        categoria.agregarJugador(jugador1);
        categoria.agregarJugador(jugador2);
        categoria.agregarJugador(jugador3);
        categoria.agregarJugador(jugador4);
        categoria.agregarJugador(jugador5);

        // Agregar el formador a la categoría
        categoria.setFormador(formador);

        // Registrar 10 asistencias para el jugador1
        for (int i = 0; i < 10; i++) {
            jugador1.agregarAsistencia(20, 5);
        }

        // Mostrar información
        System.out.println("Equipo de la categoría: " + categoria.getNombreCategoria());
        System.out.println("Formador: " + formador.getPrimerNombre() + " " + formador.getPrimerApellido());
        System.out.println("Jugadores:");
        for (Persona jugador : categoria.getEquipo()) {
            System.out.println("- " + jugador.getPrimerNombre() + " " + jugador.getPrimerApellido());
        }
        System.out.println("Asistencias de " + jugador1.getPrimerNombre() + ":");
        for (Asistencia asistencia : jugador1.getAsistencias()) {
            System.out.println("- Fecha: " + asistencia.getFechaAsist() + ", Clima: " + asistencia.getClimaJugadorInicio() + ", Carga Borg: " + asistencia.getCargaBorgEstimada());
        }
    }
}