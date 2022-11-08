package Controlador;
import Conexion.Conexion;
import Modelo.Automovil;

public class CAutomovil {
    private Conexion conexion = new Conexion();
    public boolean agregar(Automovil automovil)
    {
        Connection cnx = conexion.obtenerConexion();
        return true;
    }
}
