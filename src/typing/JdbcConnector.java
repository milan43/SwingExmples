/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import keyboard.KeyBoardType;
import static typing.JdbcConnector.c;

/**
 *
 * @author Meelon
 */
public class JdbcConnector {

    static PreparedStatement ps;
    static Connection c;

    public JdbcConnector() {

        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/keyboard";

        try (Connection c = DriverManager.getConnection(url, username, password);) {

        } catch (Exception e) {
            System.err.println(e.getMessage());

        }

    }

    public static void insertData(String query) throws SQLException {

        ps = c.prepareStatement(query);

        ps.executeUpdate();

    }

    public static void selectData() throws SQLException {
        String query = "select data from Nepali";
        ps = c.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        String result = rs.getString(1);

    }

    public static void main(String[] args) {
        JdbcConnector jdbcConnector = new JdbcConnector();
    }

}
