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
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.*;

class Mouse extends JFrame implements MouseMotionListener, MouseListener {

    Container c;
    JTextField field = new JTextField();
    JTextArea area = new JTextArea();
    JTextArea textArea = new JTextArea();

    public Mouse() {
        c = this.getContentPane();
        c.setLayout(null);

        area.setEditable(false);
        area.setBackground(Color.green);

        field.setBounds(200, 20, 300, 120);
        area.setBounds(20, 20, 150, 200);

        textArea.setBounds(200, 160, 400, 100);

        c.add(area);
        c.add(field);
        c.add(textArea);

        area.addMouseMotionListener(this);
        area.addMouseListener(this);
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        field.setText("Mouse is at" + me.getX() + " " + me.getY());
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        field.setText("Mouse Dragged at" + me.getX() + " " + me.getY());
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        textArea.append("Mouse Entered" + "\n");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        textArea.append("Mouse Exited"+ "\n");
    }

    @Override
    public void mousePressed(MouseEvent me) {
        textArea.append("Mouse pressed" + "\n");
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        textArea.append("Mouse released" + "\n");
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        textArea.append("Mouse clicked" + "\n");
    }

}

public class MouseListenerDemo {

    public static void main(String[] args) {

        Mouse mouse = new Mouse();
        mouse.setVisible(true);
        mouse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouse.setBounds(30, 30, 500, 500);

    }
}
