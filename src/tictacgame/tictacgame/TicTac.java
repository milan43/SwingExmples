/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictacgame;

/**
 *
 * @author Meelon
 */
import java.awt.*;
import javax.swing.*;

public class TicTac extends JFrame {

    JPanel panel = new JPanel();
    TicTacGame button[] = new TicTacGame[9];

    public TicTac() {
        setSize(400, 400);
        setLocation(200, 100);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++) {
            button[i] = new TicTacGame();
            panel.add(button[i]);
        }
        add(panel);
        setVisible(true);

    }
    public static void main(String[] args) {
        TicTac ticTac = new TicTac();
    }

}
