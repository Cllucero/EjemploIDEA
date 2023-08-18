/*
Ejercicios Herencia entre clases

1. Crear una jerarquia de clases.

 */

public class Contrato extends Empleado {
    private String numeroContrato ;
    private double sueldo;
    private Fecha inicioContrato;
    private Fecha finContrato;


    public Contrato(String dni, String numeroContrato, double sueldo, Fecha inicioContrato, Fecha finContrato) {
        super(dni);
        this.numeroContrato = numeroContrato;
        this.sueldo = sueldo;
        this.inicioContrato = inicioContrato;
        this.finContrato = finContrato;
    }
}
