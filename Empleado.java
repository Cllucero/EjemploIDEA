//7. Crea una clase Empleado. La clase contendrá un atributo estático o atributo de clase.


public class Empleado {
    private  String dni;
    private  String apellido;
    private  String sector;
    private Persona personax;
    private Password usuariox;
    /*
    private  int diaNac;
    private  int mesNac;
    private  int anioNac;
    */
    private static int numeroEmpleado = 0;
    private Fecha fecha;

    public Empleado(String nombrex, String apellidox,String sectorx, String nifx, String pass){

        this.sector=sectorx;
        this.personax=new Persona(nombrex,apellidox,nifx);
        this.usuariox= new Password(nifx,pass);
    }



    public Empleado(String dni, String apellido, String sector, int diaNac, int mesNac, int anioNac) {
        this.dni = dni;
        this.apellido = apellido;
        this.sector = sector;
        /*
        this.diaNac = diaNac;
        this.mesNac = mesNac;
        this.anio = anioNac;
        */
        this.fecha=new Fecha(diaNac,mesNac,anioNac);
         numeroEmpleado = numeroEmpleado++;



    }

    public Empleado(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String aplellido) {
        this.apellido = aplellido;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Fecha getFecha() {

        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }




}