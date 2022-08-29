import java.util.Scanner;

public class Ciclos4 {
//    ejercicios:
// solicitar edad y contar cuantos son mayores de edad y 
// menores de edad hay n personas.
// crear menu para el ingreso de la edad, reporte y salir.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        int menor = 0, mayor = 0;
        int edad = 0;
        while(opcion != 3)
        {
            System.out.println("**  Super Sistema **");
            System.out.println("1.- ingreso de edad");
            System.out.println("2.- Reporte");
            System.out.println("3.- salida");
            System.out.print("Seleccione opción:");
            opcion = leer.nextInt();
            
            if(opcion < 1 || opcion > 3)
            {
                System.out.println("Opción no válida.");
            }
            else
            {
                if(opcion == 1)
                {
                    System.out.println("== Contar edades ==");
                    System.out.print("Ingrese la edad:");
                    edad = leer.nextInt();
                    
                    if(edad <= 17)
                        menor++;
                    else
                        mayor++;
                }
                else if(opcion == 2)
                {
                    System.out.println("== Totales ==");
                    System.out.println("Menores : " + menor);
                    System.out.println("Mayores : " + mayor);
                    System.out.println("Total   : " + (menor+ mayor));
                }
            }
        }
        System.out.println("Pa' la casa.");
    }
}
