
public class Camion extends Vehiculo{
        
    public void mover()
    {
        System.out.println("El camión se mueve");
    }
    @Override
    public void encender(Boolean esAutomatico) {
        if(esAutomatico)
        {
            System.out.println("Dar energia con la bateria");
        }
        else
        {
            System.out.println("Encender motor con petroleo");
        }
    }
}
