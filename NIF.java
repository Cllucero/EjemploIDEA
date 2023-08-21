//Crea una clase NIF. Los atributos serán el número de DNI y la letra.
// La clase contendrá un método privado que calcule la letra del NIF a partir del número de DNI

public class NIF {

    private int numero;
    private char letra;
    private String nif;


    public  NIF (int numerox){
        numero=numerox;
        letra = letraNIF(numerox);
        nif=letra+("" + numero);
    }

    public NIF (String nifx){
        this.nif=nifx;
    }


    private char letraNIF(int numeroy){
       int aux= numeroy % 23;
        char[] tablaLetra;
        tablaLetra = new char[]{'Z', 'A', 'Q', 'W', 'S', 'X', 'E','D','C','R','F','V','T','G','B','N','H','Z', 'A', 'Q', 'W', 'S', 'X', 'E','D','C','R','F','V','T','G','B','N','H'};
        return tablaLetra[aux];
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }


    public String getNIF() {
        return nif;
    }

    public void setNIF(String nif) {
        this.nif = nif;
    }

    public static void main(String[] args) {
        NIF nif = new NIF(30988055);
        System.out.println("NIF: " + nif.getLetra()+nif.getNumero());
    }


}
