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
        g1.setFecha(Date.valueOf("2023-08-01"));
        g1.setTrabajador(t1);
        g1.generarClave();
        System.out.println(g1.datos());
        System.out.println("Alcanza?:" + g1.verificarSaldo(200000));
        System.out.println("Alcanza?:" + g1.verificarSaldo(5000));
        
        int saldo = g1.descontar(5000);
        System.out.println("Saldo actual: " + saldo);
        
        
        saldo = g1.descontar(500000);
        if(saldo >= 0 )
            System.out.println("Saldo actual: " + saldo);
        else
            System.out.println("El saldo no es suficiente");
        
        if(g1.vigencia())
            System.out.println("Está vigente");
        else
            System.out.println("No está vigente");
    }
}
