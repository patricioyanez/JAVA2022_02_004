
public class Ciclos3 {
    public static void main(String[] args) {
        int numero = 10;
//        for(int indice = 1; indice <= numero ; indice++)
//        for(int indice = 0; indice++ < numero ; )
        int indice = 0;
        for(  ; ++indice < numero ; )
        {
            System.out.println("nro:" + indice);
        }
        System.out.println("valor:" + indice);
        
        for(int x = 0; x < numero ; x+=2)
        {
            System.out.println("par:" + x);
        }
    }
}
