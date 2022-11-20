
package modelo;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class ConsultaProducto extends conexion {
    public boolean registrar (producto pro){
        PreparedStatement ps = null;/*se esta creando el objeto "ps" */
        Connection con = getConexion();
        
        String sql = "INSERT INTO estudiantes (Codigo, Nombres, Apellido, Telefono, Cantidad) values (?, ?, ?, ?, ?)";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setString(3, pro.getApellido());
            ps.setString(4, String.valueOf(pro.getTelefono()));
            ps.setString(5, String.valueOf( pro.getCantidad()));
            
            
            ps.execute();
            return true;
        }catch (SQLException e)
        {
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
}
