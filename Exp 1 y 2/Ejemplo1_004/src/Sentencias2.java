import java.util.Scanner;

public class Sentencias2 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int opcion = 0;
        
        //sout
        System.out.println("¿Cual será su voto?");
        System.out.println("1.- Apruebo");
        System.out.println("2.- Rechazo");
        System.out.println("3.- blanco");
        System.out.println("4.- Nulo");
        System.out.println("Ingrese su opción:");
        opcion = leer.nextInt();
        
        if(opcion < 1 || opcion > 4) // && => and
        {
            System.out.println("La opción no es correcta");
        }        
        else if(opcion == 1)
            System.out.println("Ud voto apruebo");
        else if(opcion == 2)
            System.out.println("Ud voto rechazo");        
        else if(opcion == 3)
            System.out.println("blanco");
        else
            System.out.println("Ud anulo el voto");
        
        String nombre;
        System.out.println("Ingrese su nombre:");
        nombre = leer.next();
        System.out.println("Gracias " + nombre + " por venir");
        
    }
}
