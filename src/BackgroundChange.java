/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meelon
 */
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
class MyFrame2 extends JFrame implements ActionListener{
    JButton red=new JButton("red");
    JButton green=new JButton("green");
    JButton blue=new JButton("blue");
    JButton yellow=new JButton("yellow");
    
    Container c;
    MyFrame2(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.MAGENTA);
      
          red.setBounds(80,30,90,30);
          green.setBounds(200,30,90,30);
          blue.setBounds(320,30,90,30);
          yellow.setBounds(440,30,90,30);
            
          red.setForeground(Color.red);
          green.setForeground(Color.green);
          blue.setForeground(Color.blue);
          yellow.setForeground(Color.yellow);
          
            red.addActionListener(this);
            green.addActionListener(this);
            blue.addActionListener(this);
            yellow.addActionListener(this);
            
            c.add(red);
            c.add(green);
            c.add(blue);
            c.add(yellow);
            
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==red){
            c.setBackground(Color.red);
        }
      if(e.getSource()==green)
       c.setBackground(Color.green);
      if(e.getSource()==blue)
        c.setBackground(Color.blue);
       if(e.getSource()==yellow)
        c.setBackground(Color.yellow);
        
    
}
    }

public class BackgroundChange {
    public static void main(String[] args) {
        MyFrame2 frame=new MyFrame2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,580,400);
        
    }
    
}

