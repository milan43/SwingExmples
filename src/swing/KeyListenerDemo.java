/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JFrame;

class Key extends JFrame implements KeyListener, WindowListener, FocusListener {

    Container c;
    JTextField field = new JTextField();
    JTextArea area = new JTextArea();
    JTextArea textArea = new JTextArea();
    JTextArea focus = new JTextArea();

    public Key() {
        c = this.getContentPane();
        c.setLayout(null);

        //  area.setEditable(true);
        area.setBackground(Color.green);

        field.setBounds(10, 20, 70, 50);
        field.setBackground(Color.cyan);
        focus.setBackground(Color.yellow);
        textArea.setBackground(Color.pink);
        Font f = new Font("ARIAL", Font.HANGING_BASELINE, 20);

        area.setBounds(100, 20, 150, 195);
        focus.setBounds(100, 215, 330, 150);

        textArea.setBounds(250, 20, 180, 200);

        focus.setFont(f);
        field.setFont(f);
        focus.setFont(f);
        area.setFont(f);
        textArea.setFont(f);

        c.add(area);
        c.add(field);
        c.add(textArea);
        c.add(focus);

        field.addKeyListener(this);
        this.addWindowListener(this);
        field.addFocusListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        area.append("Key Typed" + " " + e.getKeyChar() + "\n");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        area.append("Key Released" + " " + e.getKeyChar() + "\n");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        area.append("Key Pressed" + " " + e.getKeyChar() + "\n");
    }

    @Override
    public void windowOpened(WindowEvent e) {
        textArea.append("Window Opened\n");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        textArea.append("Window Closing\n");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        textArea.append("Window Closed\n");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        textArea.append("Window Minimized\n");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        textArea.append("Window Showen\n");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        textArea.append("Window activated\n");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        textArea.append("Window Deactivated\n");
    }

    @Override
    public void focusGained(FocusEvent e) {
        focus.append("Focus Gained\n");
    }

    @Override
    public void focusLost(FocusEvent e) {
        focus.append("Focus lost\n");
    }
}

public class KeyListenerDemo {

    public static void main(String[] args) {

        Key frame = new Key();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30, 30, 500, 500);

    }
}
