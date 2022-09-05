import java.sql.Date;
import java.time.*;
public class Principal {
    public static void main(String[] args) {
        long codigo = 1000000000000000L;
        
        Trabajador t1 = new Trabajador(10200300, "K","Juan");
        Trabajador t2 = new Trabajador();
        t2.setRut(7600500);
        t2.setDv("7");
        t2.setNombre("Ana");
        GiftCard g1 = new GiftCard();
        codigo = g1.generarCodigo(codigo);
        g1.setMonto(100000);
        g1.setFecha(Date.valueOf(LocalDate.now()));
        g1.setTrabajador(t1);
        g1.generarClave();
        System.out.println(g1.datos());
        System.out.println("Alcanza?:" + g1.verificarSaldo(200000));
        System.out.println("Alcanza?:" + g1.verificarSaldo(5000));

    }
}
