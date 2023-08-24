package Empleado;
//9. Crea una clase Empleado.Empleado.Password.
// El atributo de la clase es un String que contiene la contraseña.

public class Password {
    private final String clave;
    private String nif;

    public Password(String nif, String pass){
        this.nif=nif;
        this.clave=pass;

    }


    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        //this.clave = clave;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

   public boolean verificar (String nifInput, String claveInput) {
        if((nif.equals(nifInput) && clave.equals(claveInput))){
            System.out.println("correcto");
        return true;
        }
        else{
            System.out.println("incorrecto");
        return false;
        }

   }



}



