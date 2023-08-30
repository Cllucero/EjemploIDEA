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
            // Crear jugadores
            Jugador jugador1 = new Jugador("Ana", "Garcia", "11111111", 1, 1, 2000, "AnaG", "Juan Perez", "123456789");
            Jugador jugador2 = new Jugador("Luis", "Lopez", "22222222", 2, 2, 2001, "LuisL", "Maria Martinez", "987654321");

            // Crear formador
            Formador formador1 = new Formador("Carlos", "Martinez", "33333333", 3, 3, 1985, "FORM123", 55555555);

            // Crear categoría
            Categoria categoria = new Categoria("Sub-17", 2);
            categoria.setEquipo(jugador1);
            categoria.setEquipo(jugador2);
            categoria.setCuerpoTecnico(formador1);

            // Agregar asistencias a los jugadores
            jugador1.agregarPresente(8, 5);
            jugador1.agregarPresente(7, 6);
            jugador2.agregarPresente(6, 4);
            jugador2.agregarPresente(5, 5);

            // Calcular el clima promedio de los jugadores
            double climaPromedio = (jugador1.calcularClima() + jugador2.calcularClima()) / 2;

            // Mostrar información
            System.out.println("Categoría: " + categoria.getNombreEquipo());
            System.out.println("Cantidad de jugadores: " + categoria.getCantidadDeJugadores());
            System.out.println("Equipo:");
            for (Jugador jugador : categoria.getEquipo()) {
                System.out.println("Nombre: " + jugador.getNombres() + " " + jugador.getApellidos());
                System.out.println("Apodo: " + jugador.getApodo());
            }
            System.out.println("Cuerpo Técnico:");
            for (Formador formador : categoria.getCuerpoTecnico()) {
                System.out.println("Nombre: " + formador.getNombres() + " " + formador.getApellidos());
                System.out.println("Carnet UEFA: " + formador.getNumeroCarnetUEFA());
            }
            System.out.println("Clima promedio: " + climaPromedio);
        }
    }






