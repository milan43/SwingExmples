/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbccon;

import jdbccon.JdbcForm;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Meelon
 */
public class Jdbc extends Thread{

    private static final String usern = JdbcForm.username.getText();
    private static final String passw = JdbcForm.password.getText();

    private static final String url = "jdbc:mysql://localhost:9999/login";
    private static final String sql = "insert into userinfo values(usern,passw)";

    public static void main(String[] args) {

        
        
    }

    @Override
    public void run() {
        try (
                
                Connection c = DriverManager.getConnection(url);
                PreparedStatement statement = c.prepareStatement(sql);
                ResultSet rs=statement.executeQuery();
                ) {

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        
     }

}
