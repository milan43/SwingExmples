/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanel;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Meelon
 */
public class JpanelForm {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30, 30, 500, 500);
        Container c = frame.getContentPane();

        c.setLayout(null);
        JPanel jp1 = new JPanel();
        jp1.setBounds(250, 0, 250, 500);
        jp1.setBackground(Color.BLUE);
        c.add(jp1);

        JPanel jp = new JPanel();

        jp.setBounds(0, 0, 250, 500);
        jp.setBackground(Color.GREEN);
        c.add(jp);

    }
}
