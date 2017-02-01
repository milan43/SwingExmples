/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Meelon
 */
public class Text extends JPanel{
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 300, 300);
        Container c=frame.getContentPane();
        JTextArea area=new JTextArea();
        area.setBounds(30, 30, 100, 100);
        area.setVisible(true);
        c.setLayout(null);
        c.add(area);
    }
  
}
