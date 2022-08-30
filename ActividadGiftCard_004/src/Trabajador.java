public class Trabajador {

    // 1.- atributos
    private int rut;
    private String dv;
    private String nombre;
    
    // 2.- constructores
    
    public Trabajador() {
        this.rut = 0;
        this.dv = "";
        this.nombre = "";
    }    
    public Trabajador(int rut, String dv, String nombre) {
        this.rut = rut;
        this.dv = dv;
        this.nombre = nombre;
    }
    // 3.- getter and setter
    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // 4.- métodos customer


}
