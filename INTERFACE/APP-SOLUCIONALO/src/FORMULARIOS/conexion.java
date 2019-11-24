
package FORMULARIOS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;



//clase publica
public class conexion {
    
    //app server
    //public String driver="com.mysql.jdbc.Driver";
    public String host="localhost:8889";
    public String db="db-solucionalo";
    public String url="jdbc:mysql://"+host+"/"+db;
    public String usuario="root";
    public String contraseña="root";
   
    
    //variantes
     Connection  cn;
     Statement st;
    
    //c
    public Connection conexion () 
    {  
        Connection cn = null;
        
        try {
        
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url,usuario,contraseña);
            
            if (cn != null){
           
            
            }
        } catch (Exception  e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "no se ha conectado");
        
        }          
        return cn;
    
        
    }
}
    

