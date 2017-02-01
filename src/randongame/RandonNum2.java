/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randongame;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Meelon
 */
public class RandonNum2 extends JFrame {

    private JLabel enterinfo;
    private JTextField value;
    private JLabel result;
    private JLabel error;
    private JButton click;
    //private JLabel lose;
    int random, guess;

    public RandonNum2() throws HeadlessException {
        super ("");
        setBounds(100, 100, 300, 300);
        
        setLayout(null);
        enterinfo = new JLabel("Enter your guess between 1 t0 10");
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
        value.setBounds(135, 10, 530, 25);

        click.setBounds(10, 45, 80, 40);
        result.setBounds(10, 80, 200, 50);
        Check c = new Check();
        click.addActionListener(c);

    }

    public class Check implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            random = (int) (Math.random() * 10 + 1);

            Font f = new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 30);
            try {
                guess = (int) (Double.parseDouble(value.getText()));

                if (random == guess) {
                    value.setText("");
                    result.setFont(f);
                    result.setForeground(Color.MAGENTA);

                    result.setText("Wow! You Win");

                } else if (random != guess) {
                    result.setFont(null);
                    result.setForeground(Color.red);
                    result.setText("You Lose random number was " + random);
                }
            } catch (Exception ex) {
                result.setFont(null);
                result.setForeground(Color.black);
                result.setText("Enter number only");
            }
        }
    }

    public static void main(String[] args) {

        RandonNum2 game = new RandonNum2();

       // game.pack();
        game.setVisible(true);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setTitle("Random Number Game");
        
        
        
        game.setBackground(Color.yellow);

    }

}
