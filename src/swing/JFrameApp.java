/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Meelon
 */
public class JFrameApp extends JFrame {

    public JFrameApp() throws HeadlessException {
        JButton button = new JButton("Apple");
        
        JPanel panel = new JPanel();
        add(panel);
        panel.setBounds(0, 0, getWidth(), getHeight());
        panel.setBackground(Color.CYAN);
        
        panel.add(button);
        button.setBounds(0, 0, 30, 30);
    }

    public static void main(String[] args) {
        JFrameApp app = new JFrameApp();
        app.setLocationRelativeTo(null);
        app.setSize(new Dimension(400, 400));
        app.setVisible(true);
    }
}
