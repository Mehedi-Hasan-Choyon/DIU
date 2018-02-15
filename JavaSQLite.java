/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class JavaSQLite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SaveData saveData = new SaveData();
        saveData.setVisible(true);
    }
    
    public static Connection connectDB(){
        Connection connection = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\User\\Documents\\userinfo.sqlite");
             JOptionPane.showMessageDialog(null, "Connection established");
            return connection;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return connection ;
    }
}
