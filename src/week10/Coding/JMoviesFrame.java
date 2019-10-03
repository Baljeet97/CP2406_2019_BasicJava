package week10.Coding;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMoviesFrame extends JFrame implements ActionListener {
    JButton north = new JButton("North to Alaska");
    JButton south = new JButton("Song of the South");
    JButton east = new JButton("East Is East");
    JButton west = new JButton("Wagons West");
    JButton center = new JButton("Journey to the Center of the Earth");

    JLabel northLabel = new JLabel("1960, John Wayne");
    JLabel southLabel = new JLabel("1946, James Baskett");
    JLabel eastLabel = new JLabel("1999, Ian Aspinall");
    JLabel westLabel = new JLabel("1952, Rod Cameron");
    JLabel centerLabel = new JLabel("1959, Pat Boone");

    public JMoviesFrame() {
        setTitle("Movies Frame");
        setSize(600, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(north, BorderLayout.NORTH);
        add(south, BorderLayout.SOUTH);
        add(east, BorderLayout.EAST);
        add(west, BorderLayout.WEST);
        add(center, BorderLayout.CENTER);

        north.addActionListener(this);
        south.addActionListener(this);
        east.addActionListener(this);
        west.addActionListener(this);
        center.addActionListener(this);

        centerLabel.setVerticalAlignment(JLabel.CENTER);
        centerLabel.setHorizontalAlignment(JLabel.CENTER);
        northLabel.setVerticalAlignment(JLabel.CENTER);
        northLabel.setHorizontalAlignment(JLabel.CENTER);
        southLabel.setVerticalAlignment(JLabel.CENTER);
        southLabel.setHorizontalAlignment(JLabel.CENTER);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == north) {
            remove(north);
            add(northLabel, BorderLayout.NORTH);
        } else if (source == south) {
            remove(south);
            add(southLabel, BorderLayout.SOUTH);
        } else if (source == east) {
            remove(east);
            add(eastLabel, BorderLayout.EAST);
        } else if (source == west) {
            remove(west);
            add(westLabel, BorderLayout.WEST);
        } else {
            remove(center);
            add(centerLabel, BorderLayout.CENTER);
        }
        invalidate();
        validate();
    }

    public static void main(String[] args) {
        JMoviesFrame frame = new JMoviesFrame();
    }
}
