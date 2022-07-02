
package conex;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class Conexion {
    public Conexion(){
       Connection con;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionhoteldb","root","qwertyA1");
       } catch (Exception e){
           System.err.println("Error: "+ e);
        }
    }
    public static void main (String[] args){
        Conexion cn=new Conexion();
    }
}
