/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomColorPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Meelon
 */
public class RandomColor extends JFrame implements MouseListener {

    JPanel jPanel;

    public RandomColor() throws HeadlessException {
        setLayout(null);

        jPanel = new JPanel();
        // jPanel.setBackground(randomColor());
        add(jPanel);
        jPanel.setBounds(0, 0, 500, 500);

        jPanel.addMouseListener(this);

    }

    public Color randomColor() {

        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);

        return new Color(r, g, b);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        jPanel.setBackground(randomColor());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        jPanel.setBackground(randomColor());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        jPanel.setBackground(randomColor());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        jPanel.setBackground(randomColor());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        jPanel.setBackground(randomColor());
    }

    public static void main(String[] args) {
        RandomColor color = new RandomColor();
        color.setVisible(true);
        color.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        color.setBounds(300, 300, 500, 500);
        color.setTitle("Random Color Panel");
    }

}
