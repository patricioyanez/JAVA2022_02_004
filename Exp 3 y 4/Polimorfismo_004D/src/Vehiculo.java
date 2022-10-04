
public abstract class Vehiculo {
    private String tipoCombustible;
    private int cilindrada;
    private String marca;
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String datos() {
        return "tipoCombustible=" + tipoCombustible + 
                ", cilindrada=" + cilindrada + 
                ", marca=" + marca + 
                ", modelo=" + modelo;
    }
    
    public void mover()
    {
        System.out.println("El Vehiculo se mueve");
    }
    
    public abstract void encender(Boolean esAutomatico);

    
}
