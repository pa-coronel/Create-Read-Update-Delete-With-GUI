
package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CloseDB {
    public static void closeConnectionAndStatement(Connection conn, PreparedStatement ps, Statement stmt) {
        if (ps != null){
            try {
                ps.close();
            }catch (SQLException e){
                JOptionPane.showMessageDialog(null, "SQL Exception Error…");
            }
        }
        if (conn != null){
            try{
                conn.close();
            }catch (SQLException e){
                JOptionPane.showMessageDialog(null, "SQL Exception Error…");
            }
        }
    }
}
