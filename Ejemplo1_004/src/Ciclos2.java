import java.util.Scanner;
public class Ciclos2 {
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
        int opcion = 0;
        int apruebo = 0;
        int rechazo = 0, otro = 0;
        //sout
        while(opcion != 4)
        {
            System.out.println("¿Cual será su voto?");
            System.out.println("1.- Apruebo");
            System.out.println("2.- Rechazo");
            System.out.println("3.- Nulo / Blanco");
            System.out.println("4.- Cerrar mesa");
            System.out.println("Ingrese su opción:");
            opcion = leer.nextInt();

            if(opcion < 1 || opcion > 4) // && => and
            {
                System.out.println("La opción no es correcta");
            }        
            else if(opcion == 1)
                apruebo++;
            else if(opcion == 2)
                rechazo++;
            else if(opcion == 3)
                otro++;
        }
        System.out.println("**** Resultado de la mesa ****");
        System.out.println("Apruebo     : " + apruebo);
        System.out.println("Rechazo     : " + rechazo);
        System.out.println("Blanco/ Nulo: " + otro);
        System.out.println("Total votos : " + (apruebo+rechazo+otro));
        
        
    }  
}
