public class Sentencias {
    // psvm
    public static void main(String[] args) {    
        System.out.println("Sentencias iniciado...");
        // definir variables
        int numero = 20;
        int numero2;
        numero2 = 20;
        // sentencia IF
        if(numero == numero2)
        {
            System.out.println("Los nros son iguales");
        }
        numero2 = 40;
        
        if(numero == numero2)
        {
            System.out.println("Los nros son iguales.");
        }
        else
        {
            System.out.println("Los nros NO son iguales.");
        }
        
        int edad = 10;
        if(edad < 3)
        {
            System.out.println("Es un bebé");
        }
        else if(edad < 14)
        {
            System.out.println("Es un niño(a)");
        }
        else if(edad < 19)
        {
            System.out.println("Es un adolescente");
        }        
        else if(edad < 66)
        {
            System.out.println("Es un adulto");
        }
        else
        {
            System.out.println("Es adulto mayor");
        }
        // leer 211
    }
    
}
