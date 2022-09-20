
import java.util.ArrayList;


public class Principal {
    
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Ignacia");
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Feña");
        System.out.println(nombres);
        System.out.println("Indice 1:" + nombres.get(1));
        
        nombres.set(1, "Adrián");
        System.out.println("Indice 1:" + nombres.get(1));
        
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Nombre: " + nombres.get(i));
        }
        System.out.println("For each (optimizado)");
        for(String aux : nombres){
            System.out.println("Nombre: " + aux);
        }
        
        // eliminar un elemento
        nombres.remove(1);
        System.out.println("Datos actuales: " + nombres);
        
        // busca True si esta y False si no
        boolean res = nombres.contains("Luis");
        if(res)
            System.out.println("Esta Luis");
        else
            System.out.println("NO Esta Luis");
        
        System.out.println("Cantidad de elementos:" + nombres.size());
        nombres.clear();
        System.out.println("Cantidad de elementos:" + nombres.size());
    }
    
}
