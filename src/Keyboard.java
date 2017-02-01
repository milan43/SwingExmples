/*
 * To panelhange this lipanelense header, panelhoose Lipanelense Headers in Projepanelt Properties.
 * To panelhange this template file, panelhoose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.*;
import java.awt.*;


/* @author Meelon
 

 */
class MyFrame extends JFrame {

    JPanel panel;
    JMenuBar menuBar;
    JMenu home;
    JMenu language;

    JMenuItem nepali;
    JMenuItem english;
    JMenuItem russian;

    JTextArea display;
    JTextArea input;

    Container con;

    JButton a;
    JButton b;
    static JButton c;
    static JButton d;
    static JButton e;
    static JButton f;
    static JButton g;
    static JButton h;
    static JButton i;
    static JButton j;
    static JButton k;
    static JButton l;
    static JButton m;
    static JButton n;
    static JButton o;
    static JButton p;
    static JButton q;
    static JButton r;
    static JButton s;
    static JButton t;
    static JButton u;
    static JButton v;
    static JButton w;
    static JButton x;
    static JButton y;
    static JButton z;

    public MyFrame() {

        panel = new JPanel();
        con = this.getContentPane();
        con.add(panel);

        panel.setLayout(new FlowLayout());

        menuBar = new JMenuBar();
        home = new JMenu("Home");
        language = new JMenu("Language");
        nepali = new JMenuItem("Nepali");
        english = new JMenuItem("English");
        russian = new JMenuItem("Russian");

        menuBar.add(home);
        menuBar.add(language);
        language.add(nepali);
        language.add(english);
        language.add(russian);

        con.add(menuBar);

        display = new JTextArea();
        input = new JTextArea();

        panel.setBackground(Color.LIGHT_GRAY);

        panel.setBounds(50, 30, 1100, 600);

        a = new JButton();
        b = new JButton();
        c = new JButton();
        d = new JButton();
        e = new JButton();
        f = new JButton();
        g = new JButton();
        h = new JButton();
        i = new JButton();
        j = new JButton();
        k = new JButton();
        l = new JButton();
        m = new JButton();
        n = new JButton();
        o = new JButton();
        p = new JButton();
        q = new JButton();
        r = new JButton();
        s = new JButton();
        t = new JButton();
        u = new JButton();
        v = new JButton();
        w = new JButton();
        x = new JButton();
        y = new JButton();
        z = new JButton();
        
       

        panel.add(a);

        panel.add(b);

        panel.add(c);

        panel.add(d);

        panel.add(e);

        panel.add(f);

        panel.add(g);

        panel.add(h);

        panel.add(i);

        panel.add(j);

        panel.add(k);

        panel.add(l);

        panel.add(m);

        panel.add(n);

        panel.add(o);

        panel.add(p);

        panel.add(q);

        panel.add(r);

        panel.add(s);

        panel.add(t);

        panel.add(u);

        panel.add(v);

        panel.add(w);

        panel.add(x);

        panel.add(y);

        panel.add(z);

    }

}

public class Keyboard {

    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 30, 1200, 500);

    }

}
