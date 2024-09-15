import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class databaseConnection {

    // Update the JDBC driver string to the latest version for MySQL
    final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    
    // Database URL, Username, and Password
    final static String DB_URL = "jdbc:mysql://localhost:3307/student";
    final static String USER = "root";
    final static String PASS = "sayli123";
    
    public static Connection connection() {
        Connection conn = null;
        try {
            // Load the MySQL JDBC Driver
            Class.forName(JDBC_DRIVER);
            
            // Establish the connection with the database
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database connection failed: " + e.getMessage());
        }
        return conn;
    }
}


