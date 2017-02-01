
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Filechooser extends JFrame {
    JFileChooser chooser;
    BufferedImage img;
    JButton button,button2;
    JFrame comp;
    String filename;
    File file ; 
    JLabel label; // ADDED

    public Filechooser() {
        ActionListener actionListener=new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==button) {
                    chooser.showOpenDialog(null);
                    file = chooser.getSelectedFile();

                    try {
                        img=ImageIO.read(file);
                        ImageIcon icon=new ImageIcon(img); // ADDED
                        label.setIcon(icon); // ADDED

                        Dimension imageSize = new Dimension(icon.getIconWidth(),icon.getIconHeight()); // ADDED
                        label.setPreferredSize(imageSize); // ADDED

                        label.revalidate(); // ADDED
                        label.repaint(); // ADDED
                    }
                    catch(IOException e1) {}
                }

                if (e.getSource()==button2){
                    comp.setVisible(true);
                }
            }
        };
    }}
    
    