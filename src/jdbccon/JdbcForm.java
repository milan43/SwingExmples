/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbccon;

import java.awt.Color;
import java.awt.Event;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Meelon
 */
public class JdbcForm extends JFrame {

    static JTextField username;
    static JPasswordField password;
    static JButton insert;
    static JLabel user;
    static JLabel pass;

    public JdbcForm() throws HeadlessException {

        setLayout(null);
        username = new JTextField();
        password = new JPasswordField();
        insert = new JButton("Login");
        user = new JLabel("Username");
        pass = new JLabel("Password");

        user.setBounds(10, 10, 60, 20);
        pass.setBounds(10, 40, 60, 20);
        username.setBounds(75, 10, 100, 30);
        password.setBounds(75, 40, 100, 30);
        insert.setBounds(60, 90, 80, 40);

        add(user);
        add(username);
        add(pass);
        add(password);
        add(insert);

        event e = new event();
        insert.addActionListener(e);
    }

    private class event implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            insert.setForeground(Color.red);
            Jdbc j = new Jdbc();
            j.start();
        }
    }

    public static void main(String[] args) {

        JdbcForm form = new JdbcForm();
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setBounds(250, 200, 200, 180);
        form.setTitle("JdbcForm");
        form.setResizable(false);

    }

}
