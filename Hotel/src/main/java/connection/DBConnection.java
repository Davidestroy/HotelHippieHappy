
package connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * se crean las variable conexion de tipo conexion y para ello se exporta la libreria para poder procesar la
 * información y extraerla de la BD
 */
public class DBConnection {
    Connection connection; 
    static String bd= "hotel";
    static String port = "3306";
    static String login= "root";
    static String password = "admin";

    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url ="jdbc:mysql://localhost:"+ this.port + "/"+ this.bd;
            connection= DriverManager.getConnection(url,this.login,this.password);
            System.out.println("Conexion establecida");
        } catch (Exception e) {
            System.out.println("Error de conexion");
        }
        
    }
    public Connection getConnection(){
        return connection;
    }
    
    public void desconectar (){
        connection= null;
    }
    
}
