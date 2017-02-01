/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

/**
 *
 * @author Meelon
 */
import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {

    static JButton button1;

    static JButton button2;
    static JButton button3;
    static JButton button4;
    static JButton button5;
    //static JPanel jPanel;
    // static BorderLayout bl;

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30, 30, 500, 500);
        Container c = frame.getContentPane();
        //jPanel = new JPanel();

        //jPanel.setBounds(0, 0, JFrame.WIDTH, JFrame.HEIGHT);
        //  c.add(jPanel);
        c.setLayout(new java.awt.BorderLayout(3, 5));
        button1 = new JButton("PAGE_START");
        button2 = new JButton("LEFT");
        button3 = new JButton("CENTER");
        button4 = new JButton("RIGHT");
        button5 = new JButton("PAGE_END");

        c.add(button1, BorderLayout.NORTH);
        c.add(button2, BorderLayout.WEST);
        c.add(button3, BorderLayout.CENTER);
        c.add(button4, BorderLayout.EAST);
        c.add(button5, BorderLayout.SOUTH);

    }
}
