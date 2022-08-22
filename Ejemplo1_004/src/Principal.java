
public class Principal {    
    // metodo main
    public static void main(String[] args)
    {
        // creación de objeto a partir de la clase pizza
        Pizza pizza1 = new Pizza();
        
        Pizza pizza2;
        pizza2 = new Pizza();
        
        pizza1.preparar();
        pizza1.calentar();
        pizza2.calentar();
        
        Pizza pizza3 = new Pizza("Napolitana","Familiar", "Delgada");
        
//        System.out.println("**** Datos de la Pizza");
//        System.out.println("Nombre  : " + pizza3.getNombre());
//        pizza3.setNombre("NapoChilena");
//        System.out.println("Nombre  : " + pizza3.getNombre());
//        System.out.println("Tamaño  : " + pizza3.getTamano());
//        System.out.println("Masa    : " + pizza3.getMasa());
        pizza1.setNombre("Texana");
        pizza1.setTamano("Personal");
        pizza1.setMasa("Normal");
        pizza3.datos();
        pizza2.datos();
        pizza1.datos();
    }    
}
