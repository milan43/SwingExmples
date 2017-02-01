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
public class FlowLayoutDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);

        JPanel jPanel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10, 10, 500, 500);
        Container c = frame.getContentPane();
        c.add(jPanel);
        jPanel.setBackground(Color.red);

        JButton button = new JButton();
        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        JButton button4 = new JButton();
        JButton button5 = new JButton();
        JButton button6 = new JButton();
        JButton button7 = new JButton();
        JButton button8 = new JButton();
        JButton button9 = new JButton();

        jPanel.setLayout(new FlowLayout());

        jPanel.add(button);
        jPanel.add(button1);
        jPanel.add(button2);
        jPanel.add(button3);
        jPanel.add(button4);
        jPanel.add(button5);
        jPanel.add(button6);
        jPanel.add(button7);
        jPanel.add(button8);
        jPanel.add(button9);

    }
}
