/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patri
 */
public class Moto extends Vehiculo{
    
    public void mover()
    {
        System.out.println("La moto se mueve");
    }

    @Override
    public void encender(Boolean esAutomatico) {
        if(esAutomatico)
        {
            System.out.println("Dar energia con la bateria");
        }
        else
        {
            System.out.println("Encender motor con bencina");
        }
    }
}
