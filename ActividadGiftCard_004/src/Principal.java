import java.sql.Date;
import java.time.*;
public class Principal {
    public static void main(String[] args) {
        long codigo = 1000000000000000L;
        
        Trabajador t1 = new Trabajador(1, "K","Juan");
        Trabajador t2 = new Trabajador();
        t2.setRut(7);
        t2.setDv("7");
        t2.setNombre("Ana");
        GiftCard g1 = new GiftCard();
        codigo = g1.generarCodigo(codigo);
        g1.setMonto(100000);
        g1.setFecha(Date.valueOf(LocalDate.now()));
        g1.setTrabajador(t1);
        System.out.println(g1.datos());

    }
}
