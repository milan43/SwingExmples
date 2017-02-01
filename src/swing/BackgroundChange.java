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
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener, ItemListener {

    Container c;
    JButton red = new JButton("RED");
    JButton green = new JButton("GREE");
    JButton blue = new JButton("BLUE");
    JButton yellow = new JButton("YELLOW");

    JLabel name = new JLabel("Name");
    JTextField nam = new JTextField();
    JLabel gende = new JLabel("Gender");
    JRadioButton male = new JRadioButton("Male");
    JRadioButton female = new JRadioButton("Female");
    JLabel univ = new JLabel("Univrsity");
    String u[] = {"TU", "PU", "KU"};
    JComboBox univer = new JComboBox(u);
    JLabel course = new JLabel("Course");
    String cou[] = {"BIM", "BCIS", "BCA", "BIT"};
    JCheckBox cour;
    JButton show = new JButton("SHOW");
    JTextArea area = new JTextArea();
    ButtonGroup gndr = new ButtonGroup();

    Color[] clr = {Color.BLACK, Color.CYAN, Color.DARK_GRAY, Color.MAGENTA, Color.WHITE};

    JComboBox box = new JComboBox(clr);
    JCheckBox[] checkBox = new JCheckBox[4];
    JTextArea field = new JTextArea();
    JLabel label = new JLabel("Select");

    String[] s = {"JAVA", "PHP", "DATABASE", "ANDROID"};

    public MyFrame() {
        c = this.getContentPane();
        c.setLayout(null);

        for (int i = 0; i < cou.length; i++) {
            checkBox[i] = new JCheckBox(cou[i]);
            checkBox[i].setBounds(10, 460 + (35 * i), 100, 30);
            c.add(checkBox[i]);

        }
        for (int i = 0; i < checkBox.length; i++) {
            checkBox[i] = new JCheckBox(s[i]);
            checkBox[i].setBounds(10, 150 + (35 * i), 80, 30);
            c.add(checkBox[i]);
            checkBox[i].addItemListener(this);
        }

        red.setBounds(10, 10, 80, 50);
        green.setBounds(100, 10, 80, 50);
        blue.setBounds(190, 10, 80, 50);
        yellow.setBounds(280, 10, 80, 50);
        box.setBounds(10, 70, 350, 50);
        label.setBounds(10, 130, 50, 20);
        field.setBounds(160, 140, 200, 150);

        name.setBounds(10, 330, 100, 30);
        nam.setBounds(115, 330, 100, 30);
        gende.setBounds(10, 360, 100, 30);
        male.setBounds(115, 360, 100, 30);
        female.setBounds(220, 360, 100, 30);
        univ.setBounds(10, 390, 100, 30);
        univer.setBounds(112, 390, 100, 30);
        course.setBounds(10, 425, 100, 30);
        show.setBounds(80, 600, 100, 50);
        area.setBounds(330, 330, 200, 300);

        red.setForeground(Color.red);
        green.setForeground(Color.green);
        blue.setForeground(Color.blue);
        yellow.setForeground(Color.yellow);

        c.add(red);
        c.add(green);
        c.add(blue);
        c.add(yellow);
        c.add(box);
        c.add(label);
        c.add(field);

        c.add(name);
        c.add(nam);
        c.add(gende);
        c.add(male);
        c.add(female);
        c.add(univ);
        c.add(univer);
        c.add(course);
        c.add(show);
        c.add(area);

        gndr.add(male);
        gndr.add(female);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        yellow.addActionListener(this);
        box.addItemListener(this);

        show.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == red) {
            c.setBackground(Color.RED);
        }
        if (e.getSource() == green) {
            c.setBackground(Color.GREEN);
        }
        if (e.getSource() == blue) {
            c.setBackground(Color.blue);
        }
        if (e.getSource() == yellow) {
            c.setBackground(Color.YELLOW);
        }
        if (e.getSource() == show) {
            area.setBackground(Color.orange);
            String nme = nam.getText();
            String gnrer = "male";
            if (female.isSelected()) {
                gnrer = "Female";

            }
            String universit = (String) univer.getSelectedItem();
            area.setText("Name=" + nme + "\n" + "Gender=" + gnrer + "\n" + "University=" + universit);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        field.setText("");

        for (int j = 0; j < checkBox.length; j++) {
            if (checkBox[j].isSelected()) {
                field.append(checkBox[j].getText() + "\n");
            }
        }

        Color selectedColor = (Color) box.getSelectedItem();
        c.setBackground(selectedColor);

    }

}

public class BackgroundChange {

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();

        frame.setBounds(50, 50, 600, 900);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
    }
}
