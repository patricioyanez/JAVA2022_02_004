package Controlador;
import Conexion.Conexion;
import Modelo.Automovil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CAutomovil {
    private Conexion conexion = new Conexion();
    public boolean agregar(Automovil automovil) 
    {
        Connection cnx = conexion.obtenerConexion();
        
        String sql = "INSERT INTO AUTOMOVIL("
                + "patente, numeropuertas, cilindrada, color, marca, modelo, "
                + "anio, encendidoelectronico, tipocombustible) "
                + " VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = cnx.prepareStatement(sql);
            stmt.setString(1, automovil.getPatente());
            stmt.setInt(2, automovil.getNumeroPuerta());
            stmt.setDouble(3, automovil.getNumeroPuerta());
            stmt.setString(4, automovil.getColor());
            stmt.setString(5, automovil.getMarca());
            stmt.setString(6, automovil.getModelo());
            stmt.setInt(7, automovil.getAnio());
            stmt.setInt(8, (automovil.isEncendidoElectronico()?1:0));
            stmt.setString(9, automovil.getTipoCombustible());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error de conexión" + ex.getMessage());
            return false;
        }
    }
}
