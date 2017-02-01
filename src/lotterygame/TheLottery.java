/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotterygame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class TheLottery extends JFrame implements ActionListener {

    /**
     **author Samy
     */

    JFrame frame = new JFrame("The Lottery");
    JPanel panel = new JPanel(new FlowLayout());
    JButton play = new JButton("Play");
    JButton exit = new JButton("Exit");
    JLabel label = new JLabel();

    private static final long serialVersionUID = 1L;

    public void TheLottery() {

        panel.add(label);

        int width = 720;
        int height = width / 16 * 9;

        frame.setSize(width, height);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.add(panel);

        panel.setBackground(new Color(0x222222));
        panel.setBorder(new EtchedBorder(new Color(0xAAAAAA), new Color(0x666666)));
        panel.add(play);
        panel.add(exit);

        play.addActionListener(this);
        exit.addActionListener(this);

        play.setToolTipText("Click me to play the lottery!");
        exit.setToolTipText("Click me to exit.");

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object action = e.getSource();

        String winnings = null;
        double lotteryChance = Math.random() * 100;

        if (action == play) {

            if (lotteryChance > 80) {
                winnings = ("You lost! Luckily this lottery is free to play.");
            } else if (lotteryChance < 80 && lotteryChance > 50) {
                winnings = ("You've won $100!");
            } else if (lotteryChance < 50 && lotteryChance > 20) {
                winnings = ("You've won $500!");
            } else if (lotteryChance < 20 && lotteryChance > 5) {
                winnings = ("You've won $2,000!");
            } else if (lotteryChance < 5 && lotteryChance > 1) {
                winnings = ("You've won $5,000!");
            } else if (lotteryChance < 1 && lotteryChance > 0.1) {
                winnings = ("You've won $25,000!");
            } else if (lotteryChance < 0.1 && lotteryChance > 0.01) {
                winnings = ("You've won $50,000!");
            } else if (lotteryChance < 0.01 && lotteryChance > 0.001) {
                winnings = ("You've won $250,000!");
            } else if (lotteryChance < 0.001 && lotteryChance > 0) {
                winnings = ("YOU'VE WON THE JACKPOT OF $1,000,000!");
            } else {
                winnings = ("Something went wrong, no winnings this round.");
            }

            System.out.println("Your number is: " + lotteryChance);
            System.out.println(winnings);
        }
        if (action == exit) {
            System.exit(1);
        }
        label.setText("<html><font color='white'>Your number is: " + lotteryChance + " -                                               " + winnings + "</font></html>");

    }
}
