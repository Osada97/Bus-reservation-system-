
package INFT;

import java.sql.Connection;
import java.sql.DriverManager;


public class Myconnection {
    
    public static Connection getConnection(){
    
        Connection con=null;
        
            try {
            
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/create_login","root","");
                
        } catch (Exception e) {
            
        }
        
     return con;
    }

  
}
