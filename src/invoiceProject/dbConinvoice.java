
package invoiceProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;


public class dbConinvoice {

    
    private String url = "jdbc:mysql://localhost:3306/invoiceproject";
    private String user = "root";
    private String password = "xxxxxxxxxxxx";
    private String driver = "com.mysql.jdbc.Driver";
    private Connection con = null;
    
    public  Connection getCon() throws ClassNotFoundException{
    
    Class.forName(driver);
        try {
            con=DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(dbConinvoice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    
    }
    
    }

