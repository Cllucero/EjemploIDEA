package PracticasCursoUdemi.Matematica;

public class MainMatematicas {

 public static void main(String[] args){
      Factorial factorial1 = new Factorial();
      Factorial factorial2 = new Factorial();

      System.out.println("Llamada de metodo: "+factorial1.factorialPorRecursivo(6) );
     System.out.println("Llamada de metodo: "+factorial2.factorialPorIterativos(6) );


 }
}
