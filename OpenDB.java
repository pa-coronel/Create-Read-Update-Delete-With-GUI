
package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class OpenDB {
    OpenDB(){
        try{
            String host = "jdbc:derby://localhost:1527/StudentRecord";
            String uName = "testing";
            String uPass= "testing";

            Connection con = DriverManager.getConnection(host, uName, uPass);

            System.out.println("Successfully connected to: " + host);

        }catch (SQLException err) {
            System.out.println( err.getMessage( ) );
        }
        
    }
}
