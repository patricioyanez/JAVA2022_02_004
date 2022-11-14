package Controlador;
import Conexion.Conexion;
import Modelo.Automovil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            stmt.setDouble(3, automovil.getCilindrada());
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
    
    public Automovil buscarPorPatente(String patente)
    {
        try {
            Connection cnx = conexion.obtenerConexion();
            String sql = "SELECT * FROM AUTOMOVIL WHERE PATENTE = ?";
            PreparedStatement sp = cnx.prepareStatement(sql);
            sp.setString(1, patente);
            ResultSet rs = sp.executeQuery();
            
            if(rs.next())
            {
                Automovil automovil = new Automovil();
                automovil.setPatente(rs.getString("PATENTE"));
                automovil.setNumeroPuerta(rs.getInt("NUMEROPUERTAS"));
                automovil.setCilindrada(rs.getDouble("CILINDRADA"));
                automovil.setColor(rs.getString("COLOR"));
                automovil.setMarca(rs.getString("MARCA"));
                automovil.setModelo(rs.getString("MODELO"));
                automovil.setAnio(rs.getInt("ANIO"));
                automovil.setEncendidoElectronico((rs.getInt("ENCENDIDOELECTRONICO")==1?true:false));
                automovil.setTipoCombustible(rs.getString("TIPOCOMBUSTIBLE"));
                
                return automovil;
            }
            else
                return null;
        } catch (SQLException ex) {
            Logger.getLogger(CAutomovil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
  
    public boolean modificar(Automovil automovil) 
    {
        Connection cnx = conexion.obtenerConexion();
        
        String sql = "UPDATE AUTOMOVIL SET "
                + "NUMEROPUERTAS = ?, CILINDRADA = ?, COLOR = ?, MARCA = ?, MODELO = ?, "
                + "ANIO = ?, ENCENDIDOELECTRONICO = ?, TIPOCOMBUSTIBLE = ? "
                + " WHERE PATENTE = ?";
        PreparedStatement stmt;
        try {
            stmt = cnx.prepareStatement(sql);
            stmt.setInt(1, automovil.getNumeroPuerta());
            stmt.setDouble(2, automovil.getCilindrada());
            stmt.setString(3, automovil.getColor());
            stmt.setString(4, automovil.getMarca());
            stmt.setString(5, automovil.getModelo());
            stmt.setInt(6, automovil.getAnio());
            stmt.setInt(7, (automovil.isEncendidoElectronico()?1:0));
            stmt.setString(8, automovil.getTipoCombustible());
            stmt.setString(9, automovil.getPatente());

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
