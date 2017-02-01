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
import javax.swing.*;
import java.awt.event.*;

public class TicTacGame extends JButton implements ActionListener {

    ImageIcon X, O;
    byte index = 0;

    public TicTacGame() {
     
        X = new ImageIcon(getClass().getResource("/images/cross.png"));
        O = new ImageIcon(getClass().getResource("/images/lbtn.png"));
        addActionListener(this);
    }
 

    @Override
    public void actionPerformed(ActionEvent e) {
        index++;
        index %= 3;

        switch (index) {
            case 0:
                setIcon(null);
                break;
            case 1:
                setIcon(X);
                break;
            case 2:
                setIcon(O);
                break;
            default:
                setIcon(O);
                break;
        }
    }

}
