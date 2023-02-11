package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DBConnection {
    
    static public final String DB_URL = "jdbc:mysql://localhost/covidcare";
    static public final String USEERNAME = "root";
    static public final String PASSWORD = "";
    
    private static Connection conn = null;
    
    
    public static Connection getconn()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection(DB_URL,USEERNAME,PASSWORD);
            System.out.println("Database Connected!");
        }
        catch(ClassNotFoundException | SQLException obj)
        {
            JOptionPane.showMessageDialog(null, obj.toString());
        }
        
        return conn;
    }
    
    /**
     *
     * @throws SQLException
     */
    public static void closeconn() throws SQLException
    {
        try 
        {
            System.out.println("Database Closed!");
            conn.close();
            
            
        } catch (SQLException ex) 
        {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
