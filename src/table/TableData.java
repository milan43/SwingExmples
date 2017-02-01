/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Meelon
 */
public class TableData extends JFrame {

    JTable table;

    public TableData() throws HeadlessException {
        setLayout(new FlowLayout());

        String columns[] = {"Name", "Gender", "age"};

        Object[][] data = {{"Bipin", "Male", "22"}, {"Sita", "Female", "18"}, {"Hari", "Male", "20"}, {"Srji", "Female", "19"}

        };

        table = new JTable(data, columns);

        table.setPreferredScrollableViewportSize(new Dimension(400, 50));

        table.setFillsViewportHeight(true);

        JScrollPane jScrollPane = new JScrollPane(table);
        add(jScrollPane);

    }

    public static void main(String[] args) {
        TableData data = new TableData();
        data.setVisible(true);
        data.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        data.setBounds(100, 100, 500, 300);
        data.setTitle("Table with data");

    }
}
