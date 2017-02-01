/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typing;

/**
 *
 * @author Meelon
 */
import com.sun.javafx.print.PrinterImpl;
import javax.swing.*;
import java.awt.AWTError.*;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.print.Printer;

public class Printing extends JFrame implements Printable {
    
    JFrame frame;
    JTextArea area;
    JLabel jLabel;
    JButton b1, b2;
    
    public Printing() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 150, 300, 300);
        frame.setLayout(new FlowLayout());
        
        area = new JTextArea(10, 10);
        jLabel = new JLabel("TEXT Yo Print");
        b1 = new JButton("Print");
        b2 = new JButton("Clear");
        
        frame.add(jLabel);
        frame.add(area);
        frame.add(b1);
        frame.add(b2);
        frame.setVisible(true);
        b1.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                PrinterJob pjob = PrinterJob.getPrinterJob();
                PageFormat preformat = pjob.defaultPage();
                preformat.setOrientation(PageFormat.LANDSCAPE);
                PageFormat postformat = pjob.pageDialog(preformat);
//If user does not hit cancel then print.
                if (preformat != postformat) {
                    //Set print component
                    pjob.setPrintable(new Printing(), postformat);
                    if (pjob.printDialog()) {
                        try {
                            pjob.print();
                        } catch (PrinterException ex) {
                            JOptionPane.showMessageDialog(null, ex);
                        }
                    }
                }
            }
        });
        
        b2.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setText("");
            }
        });
    }
    
    
    @Override
    public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
            if (page > 0) { /* We have only one page, and 'page' is zero-based */

            return NO_SUCH_PAGE;
        }

        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());

        frame.printAll(g);
        return PAGE_EXISTS;
    }
    
    public static void main(String[] args) {
        Printing printing = new Printing();
    }
    
}
