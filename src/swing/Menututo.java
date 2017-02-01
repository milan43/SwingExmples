/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Meelon
 */
public class Menututo extends JFrame {

    JMenuBar menuBar;
    JMenu menu;
    JMenu color;
    JMenuItem item;
    JMenuItem red;
    JMenuItem green;
    JMenuItem blue;
    JMenuItem preeti;
    Container c;
    JTextField field;
    Font f;

    public Menututo() throws HeadlessException {
        f = new Font("PREETI", Font.BOLD, 20);

//        setLayout(new FlowLayout());
        c = this.getContentPane();
        c.setLayout(null);
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        color = new JMenu("Color");
        menuBar.add(color);

        menu = new JMenu("File");
        menuBar.add(menu);

        item = new JMenuItem("Exit");
        menu.add(item);

        red = new JMenuItem("red");
        color.add(red);

        green = new JMenuItem("green");
        color.add(green);

        blue = new JMenuItem("blue");
        color.add(blue);

        preeti = new JMenuItem("preeti");
        color.add(preeti);

        ExitMenu em = new ExitMenu();
        item.addActionListener(em);

        field = new JTextField();
        field.setBounds(100, 100, 200, 200);
        add(field);

        Color c = new Color();
        red.addActionListener(c);
        green.addActionListener(c);
        blue.addActionListener(c);
        preeti.addActionListener(c);

        // Red r=new Red();
    }

    public class ExitMenu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }

    }

    public class Color implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == red) {
                menuBar.setBackground(java.awt.Color.red);
            } else if (e.getSource() == green) {
                color.setBackground(java.awt.Color.GREEN);
            } else if (e.getSource() == preeti) {
                c.setBackground(java.awt.Color.PINK);
                field.setFont(f);
            } else {
                c.setBackground(java.awt.Color.BLUE);
            }

            red.getAccessibleContext().getAccessibleComponent().setBackground(java.awt.Color.red);
            green.getAccessibleContext().getAccessibleComponent().setBackground(java.awt.Color.green);
            blue.getAccessibleContext().getAccessibleComponent().setBackground(java.awt.Color.blue);
        }

    }

    public static void main(String[] args) {
        Menututo menututo = new Menututo();
        menututo.setVisible(true);
        menututo.setBounds(100, 100, 500, 500);
        menututo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
