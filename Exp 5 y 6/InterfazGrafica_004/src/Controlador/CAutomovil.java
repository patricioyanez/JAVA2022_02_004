package Controlador;
import Conexion.Conexion;
import Modelo.Automovil;
import java.sql.Connection;

public class CAutomovil {
    private Conexion conexion = new Conexion();
    public boolean agregar(Automovil automovil)
    {
        Connection cnx = conexion.obtenerConexion();
        
        String sql = "INSERT INTO AUTOMOVIL"
        return true;
    }
}
