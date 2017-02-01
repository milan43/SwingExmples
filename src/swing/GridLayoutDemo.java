/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Meelon
 */
public class GridLayoutDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setBounds(30, 30, 500, 500);
        JPanel jPanel = new JPanel();
        Container c = frame.getContentPane();
        c.add(jPanel);

        JButton button1 = new JButton("btn1");
        JButton button2 = new JButton("btn2");
        JButton button3 = new JButton("btn3");
        JButton button4 = new JButton("btn4");
        JButton button5 = new JButton("btn5");

        jPanel.setLayout(new GridLayout(5,10));

        jPanel.add(button1);
        jPanel.add(button2);
        jPanel.add(button3);
        jPanel.add(button3);
        jPanel.add(button5);

    }

}
