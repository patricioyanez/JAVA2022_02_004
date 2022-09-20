/*

Creamos la primera clase
*/


public class Pizza {
// 1.- atributos
    private String nombre;
    private String tamano;
    private String masa;
// 2.- constructor
    public Pizza()
    {
        this.nombre = "";
        this.tamano = "";
        this.masa   = "";
        //System.out.println("Constructor sin parametros...");
    }
    public Pizza(String nombre, String tamano, String masa)
    {
        this.nombre = nombre;
        this.tamano = tamano;
        this.masa = masa;
    }
// 3.- getter and setter
    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getTamano()
    {
        return this.tamano;
    }
    public void setTamano(String tamano)
    {
        this.tamano = tamano;
    }
    public String getMasa()
    {
        return this.masa;
    }
    public void setMasa(String masa)
    {
        this.masa = masa;
    }
// 4.- metodos customer(personalizado)
    public void preparar()
    {
        System.out.println("Se esta preparando la pizza");
    }
    public void calentar()
    {
        System.out.println("La pizza esta calentandose");
    }
    public void datos()
    {
        System.out.println("**** Datos de la Pizza ****");
        System.out.println("Nombre  : " + this.nombre);
        System.out.println("Tamaño  : " + this.getTamano());
        System.out.println("Masa    : " + this.getMasa());
    }
}
