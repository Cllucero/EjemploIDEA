package Empleado;

public class main {
    public static void main(String[] args) {

        Fecha xF = new Fecha(12,8,2000);
        Persona xP = new Persona("luciano", "lucero", "36135f");
        NIF xNif = new NIF(30988055);
        xP.imprimirDetalles();
        System.out.println("Empleado.Empleado.NIF: " + xNif.getLetra()+xNif.getNumero());

    }
}
