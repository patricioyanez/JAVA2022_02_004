import java.util.Scanner;

public class Sentencias3 {
    // psvm
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int grado;
        System.out.println("Declaración de nivel de educación");
        System.out.println("1.- Básica");
        System.out.println("2.- Media");
        System.out.println("3.- Superior");
        System.out.println("4.- Magister");
        System.out.println("5.- Doctor");
        System.out.println("6.- No tiene");
        System.out.print("Seleccione nivel:");
        grado = leer.nextInt();
        
        switch(grado)
        {
            case 1:
                System.out.println("Ud tiene solo educación básica.");
                break;
            case 2:
                System.out.println("Ud tiene hasta la ed. Media.");
                break;
            case 3:
                System.out.println("Ud. tiene edu. profesional.");
                break;
            case 4:
                System.out.println("Ud. tiene magister o master");
                break;
            case 5:
                System.out.println("Uds es doctor.");
                break;
            case 6:
                System.out.println("Ud no ha cursado ningún nivel ed.");
                break;
            default:
                System.out.println("Ud. no ingrese la opción correcta.");
        }
        
        // Leer la 221
    }
}
