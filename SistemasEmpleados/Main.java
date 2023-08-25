package SistemasEmpleados;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Gerente y Operario
        Gerente gerente = new Gerente("Gerente1", 5, 1);
        Operario operario = new Operario("Operario1", 2, 4);

        // Crear una instancia de Empresa
        Empresa empresa = new Empresa("Mi Empresa", 10);

        // Agregar empleados a la empresa agregarEmpleado
        empresa.agregarEmpleado(operario);
        empresa.agregarEmpleado(gerente);
        empresa.agregarEmpleado(operario);
        empresa.agregarEmpleado(gerente);
        empresa.agregarEmpleado(operario);
        empresa.agregarEmpleado(gerente);
        empresa.agregarEmpleado(operario);
        empresa.agregarEmpleado(gerente);
        // Calcular y mostrar salarios totales
        empresa.calcularPagosTotalAEmpleados();

        // Verificar si algún empleado puede gestionar u operar
        if (gerente instanceof PuedeGestionar) {
            gerente.gestionar();
        }
        if (operario instanceof PuedeOperar) {
            operario.operar();
        }
    }
}
