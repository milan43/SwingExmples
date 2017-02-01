/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randongame;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Meelon
 */
public class RandomNum extends JFrame {

    private JLabel enterinfo;
    private JTextField value;
    private JLabel result;
    private JLabel error;
    private JButton click;
    //private JLabel lose;
    int random, guess;

    public RandomNum() throws HeadlessException {
        setLayout(null);
        enterinfo = new JLabel("Enter your guess between 1 t0 5");
        value = new JTextField("");
        result = new JLabel("");
        click = new JButton("Check");
        //lose = new JLabel();
        // error = new JLabel();

        add(enterinfo);
        add(value);
        add(result);
        add(click);

        enterinfo.setBounds(10, 10, 120, 30);
        value.setBounds(135, 10, 70, 25);
        click.setBounds(10, 45, 80, 40);
        result.setBounds(10, 80, 200, 50);
        Check c = new Check();
        click.addActionListener(c);

    }

    public class Check implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            random = (int) (Math.random() * 5 + 1);

            Font f = new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 30);
            try {
                guess = (int) (Double.parseDouble(value.getText()));

                if (random == guess) {
                    result.setFont(f);
                    result.setForeground(Color.MAGENTA);
                    //.setBounds(100, 100, 300, 300);

                    dispose();

                    new RandonNum2().setVisible(true);
                 
                    result.setText("Wow!You Win");
                } else if (random != guess) {
                    result.setForeground(Color.red);
                    result.setText("You Lose random number was " + random);
                }
            } catch (Exception ex) {
                result.setForeground(Color.black);
                result.setText("Enter number only");
            }
        }

    }

    public static void main(String[] args) {
        RandomNum game = new RandomNum();
        game.setVisible(true);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setTitle("Random Number Game");
        game.setBounds(100, 100, 300, 300);
    }

}
