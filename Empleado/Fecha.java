package Empleado;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean verificarFecha() {
        if (anio > 0 && mes >= 1 && mes <= 12 && dia >= 1 && dia <= cantDiasMes()) {
            return true;
        } else {
            return false;
        }
    }

    public int cantDiasMes() {
        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return esBisiesto() ? 29 : 28;
            default:
                return 31;
        }
    }

    public boolean esBisiesto() {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public void siguienteDia() {
        if (dia < cantDiasMes()) {
            dia++;
        } else {
            dia = 1;
            if (mes < 12) {
                mes++;
            } else {
                mes = 1;
                anio++;
            }
        }
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }
}
