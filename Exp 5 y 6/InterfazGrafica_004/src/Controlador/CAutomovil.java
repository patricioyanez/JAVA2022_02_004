package Controlador;
import Conexion.Conexion;
import Modelo.Automovil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CAutomovil {
    private Conexion conexion = new Conexion();
    public boolean agregar(Automovil automovil) throws SQLException
    {
        Connection cnx = conexion.obtenerConexion();
        
        String sql = "INSERT INTO AUTOMOVIL("
                + "patente, numeropuestas, cilindrada, color, marca, modelo, "
                + "anio, encendidoelectronico, tipocombustible) "
                + " VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = cnx.prepareStatement(sql);
        stmt.setString(1, automovil.getPatente());
        stmt.setInt(2, automovil.getNumeroPuerta());
        return true;
    }
}
