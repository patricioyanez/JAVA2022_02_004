
package Modelo;


public class Automovil {
    private String patente;
    private int numeroPuerta;
    private Double cilindrada;
    private String color;
    private String marca;
    private String modelo;
    private int anio;
    private boolean encendidoElectronico;
    private String tipoCombustible;

    public Automovil() {
        this.patente = "";
        this.numeroPuerta = 0;
        this.cilindrada = 0d;
        this.color = "";
        this.marca = "";
        this.modelo = "";
        this.anio = 0;
        this.encendidoElectronico = false;
        this.tipoCombustible = "";
    }
    public Automovil(String patente, int numeroPuerta, Double cilindrada, String color, String marca, String modelo, int anio, boolean encendidoElectronico, String tipoCombustible) {
        this.patente = patente;
        this.numeroPuerta = numeroPuerta;
        this.cilindrada = cilindrada;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.encendidoElectronico = encendidoElectronico;
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public void setNumeroPuerta(int numeroPuerta) {
        this.numeroPuerta = numeroPuerta;
    }

    public Double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isEncendidoElectronico() {
        return encendidoElectronico;
    }

    public void setEncendidoElectronico(boolean encendidoElectronico) {
        this.encendidoElectronico = encendidoElectronico;
    }


    public String imprimirDatos() {
        return "Automovil{" + "patente=" + patente + ", numeroPuerta=" + numeroPuerta + ", cilindrada=" + cilindrada + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", encendidoElectronico=" + encendidoElectronico + ", tipoCombustible=" + tipoCombustible + '}';
    }
    
    // crear el formulario, validar y traspasar los datos a un 
    // objeto Automovil
    
}
