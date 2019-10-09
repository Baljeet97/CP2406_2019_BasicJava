package week10.Coding;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JColorFrame extends JFrame implements ActionListener {
    JButton north = new JButton();
    JButton south = new JButton();
    JButton east = new JButton();
    JButton west = new JButton();
    JButton center = new JButton("Click me");

    int count = 0;

    public JColorFrame() {
        setTitle("JColorFrame");
        setSize(300, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        north.setPreferredSize(new Dimension(40, 60));
        south.setPreferredSize(new Dimension(40, 60));
        east.setPreferredSize(new Dimension(80, 60));
        west.setPreferredSize(new Dimension(80, 60));

        add(north, BorderLayout.NORTH);
        add(south, BorderLayout.SOUTH);
        add(east, BorderLayout.EAST);
        add(west, BorderLayout.WEST);
        add(center, BorderLayout.CENTER);

        center.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ++count;
        if (count == 1) {
            north.setBackground(Color.GREEN);
            south.setBackground(Color.WHITE);
            west.setBackground(Color.WHITE);
            east.setBackground(Color.WHITE);
        } else if (count == 2) {
            east.setBackground(Color.MAGENTA);
            south.setBackground(Color.WHITE);
            west.setBackground(Color.WHITE);
            north.setBackground(Color.WHITE);
        } else if (count == 3) {
            west.setBackground(Color.ORANGE);
            east.setBackground(Color.WHITE);
            south.setBackground(Color.WHITE);
            north.setBackground(Color.WHITE);
        } else if (count == 4) {
            south.setBackground(Color.RED);
            east.setBackground(Color.WHITE);
            west.setBackground(Color.WHITE);
            north.setBackground(Color.WHITE);
            count = 0;
        }
    }

    public static void main(String[] args) {
        JColorFrame frame = new JColorFrame();
    }
}