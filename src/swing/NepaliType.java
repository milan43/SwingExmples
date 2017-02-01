/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Meelon
 */
public class NepaliType {

    public static JTextField field;

    public static void main(String[] args) {
        JFrame frane = new JFrame();
        Container c = frane.getContentPane();
        c.setLayout(null);
        frane.setVisible(true);
        frane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frane.setBounds(10, 10, 400, 400);
        Font f = new Font("PREETI", Font.BOLD, 20);
        field = new JTextField();
        field.setBounds(10, 10, 100, 300);
        field.setBackground(Color.YELLOW);
        c.add(field);
        field.setFont(f);
        

    }

}
