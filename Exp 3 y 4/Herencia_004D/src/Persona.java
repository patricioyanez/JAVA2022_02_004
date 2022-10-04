
public class Persona {
    private String rut;
    private String nombre;
    private boolean hablaEspanol;
    
    public Persona() {
        System.out.println("Soy Persona");
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isHablaEspanol() {
        return hablaEspanol;
    }

    public void setHablaEspanol(boolean hablaEspanol) {
        this.hablaEspanol = hablaEspanol;
    }
    
    public String datos()
    {
        return  "\nRut          : " + this.rut +
                "\nNombre       : " + nombre +
                "\nHabla español: " + (isHablaEspanol()?"SI":"No");
    }

}
