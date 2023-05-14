import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class App {
    JFrame frame;
    JTable table;
    JButton loadButton;

    App() {
        initFrameAndTable();
    }

    void initFrameAndTable() {
        // Frame initialization
        frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Frame Title
        frame.setTitle("JTable Example");

        JPanel outerPanel = new JPanel(new BorderLayout());
        JPanel topPanel = new JPanel(new BorderLayout());

        // Column heads
        String[] colHeads = {"May 2019", "May 2018", "Change", "Programming Language", "Ratings"};
        String[][] data = {};
        DefaultTableModel model = new DefaultTableModel(data, colHeads);

        // Table
        table = new JTable(model);

        // Scroll pane
        JScrollPane scrollPane = new JScrollPane(table);

        // Load button
        loadButton = new JButton("Load");
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Connection c = null;
                Statement stmt = null;
                try {
                    Class.forName("org.sqlite.JDBC");
                    c = DriverManager.getConnection("jdbc:sqlite:tiobe.db");
                    c.setAutoCommit(false);
                    stmt = c.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT * FROM Ranking;");

                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    model.setRowCount(0);
                    while (rs.next()) {
                        int thisYear = rs.getInt("May2019");
                        int lastYear = rs.getInt("May2018");
                        String change = rs.getString("Change");
                        String prgLang = rs.getString("PrgLang");
                        String ratings = rs.getString("Ratings");
                        model.addRow(new Object[]{Integer.toString(thisYear),
                                Integer.toString(lastYear), change, prgLang, ratings});
                    }

                    rs.close();
                    stmt.close();
                    c.close();
                }
                catch (Exception exp) {
                    exp.printStackTrace();
                }
            }
        });

        topPanel.add(scrollPane, BorderLayout.CENTER);
        topPanel.add(loadButton, BorderLayout.PAGE_END);
        outerPanel.add(topPanel);
        frame.add(outerPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 200);
        frame.setVisible(true);
    }
}
