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

public class ChatDisp {
    static JTextField port;
    static JTextField display;
    static JButton send;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setBounds(50, 50, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        JPanel jp = new JPanel();
        c.add(jp);
        jp.setLayout(null);
        jp.setBounds(0, 0, frame.getWidth(), frame.getHeight());

        port.setBounds(30, 300,100,80);
        
    }

}
