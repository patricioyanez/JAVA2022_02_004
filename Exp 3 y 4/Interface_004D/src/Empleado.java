
import java.util.ArrayList;


public class Empleado extends Persona implements IOperaciones {
 
    private String rut;
    private String nombre;

    public Empleado() {
        this.rut = "";
        this.nombre = "";
    }
    
    public Empleado(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String datos() {
        return "Empleado{" + "rut=" + rut + ", nombre=" + nombre + '}';
    }

    @Override
    public int grabar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void limpiar() {
        this.rut =
                this.nombre = "";
        int valor = 1000 * IVA;
    }

    @Override
    public ArrayList<Object> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
