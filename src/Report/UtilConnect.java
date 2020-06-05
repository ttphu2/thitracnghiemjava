package Report;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hocgioinhatlop
 */
public class UtilConnect {
    public static Connection connection;
    public static synchronized Connection getConnection(){
        if(connection !=null){
            return connection;
        }
        else{           
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url= "jdbc:mysql://localhost:3306/thitracnghiem";
                String user ="root";
                String pass="1234";
                connection = (Connection) DriverManager.getConnection(url, user, pass);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UtilConnect.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(UtilConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            return connection;
    }
    
    public static synchronized void closeConnection(){
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(UtilConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally{
                connection=null;
            }
        }
        
        
    }
}
