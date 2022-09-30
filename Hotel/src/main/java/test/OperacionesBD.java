package test;
import beans.Habitacion;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * el resulset es para que la conexion pueda acceder a la base de datos y 
 * el Statement es para que entienda que es una sentencia de SQL
 * aqui se crea la conexion con la base de datos
 */

public class OperacionesBD {
    public static void main(String[] args) {
        //listarHabitaciones ();
    }
    public static void actualizarHabitacion (int id,String nombre){
        DBConnection con=  new DBConnection();
        String sql= "UPDATE habitacion SET nombre = '"+ nombre+ "WHERE id= "+ id;
        
        try {
          Statement st = con.getConnection().createStatement();
          st.executeUpdate(sql);
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        finally {
            con.desconectar();
        }
    }
    public static void listarHabitaciones(){
        DBConnection con=  new DBConnection();
        String sql = "SELECT * FROM habitacion";
        
        try {
          Statement st = con.getConnection().createStatement();
          ResultSet rs = st.executeQuery(sql);
          
            while (rs.next ()) { 
                int id_hab =rs.getInt("id_hab");
                String nombre_hab = rs.getString("nombre_hab");
                int capacidad_hab =rs.getInt("capacidad_hab");
                int camas_hab =rs.getInt("camas_hab");
                int terraza_hab =rs.getInt("terraza_hab");
                int baños_hab =rs.getInt("baños_hab");
                String especificaciones = rs.getString("especificaciones");
                Habitacion habitacion = new Habitacion (id_hab,nombre_hab,capacidad_hab,camas_hab,terraza_hab,baños_hab,especificaciones);
                System.out.println(habitacion.toString());
                
            }
        st.executeQuery(sql);
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        finally {
            con.desconectar();
        }
  
    }
}
