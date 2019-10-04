package week10.Coding;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JavaJuniorCollege extends JFrame implements ActionListener {
    JMenuBar mainBar = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenu campus = new JMenu("Campuses");
    JMenu majors = new JMenu("Majors");
    JMenu activities = new JMenu("Activities");

    JMenuItem exit = new JMenuItem("Exit");
    JMenuItem smithField = new JMenuItem("SmithField");
    JMenuItem towns = new JMenuItem("TownsVille");
    JMenuItem brissi = new JMenuItem("Brisbane");
    JMenuItem technology = new JMenuItem("Information Technology");
    JMenuItem science = new JMenuItem("Science");
    JMenuItem law = new JMenuItem("Laws");
    JMenuItem sky = new JMenuItem("Sky Diving");
    JMenuItem scuba = new JMenuItem("Scuba Diving");
    JMenuItem music = new JMenuItem("Music Night");

    JLabel heading = new JLabel("Junior College");
    JLabel description = new JLabel(" ");

    public JavaJuniorCollege() {
        setTitle("Junior College");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setJMenuBar(mainBar);

        mainBar.add(file);
        mainBar.add(campus);
        mainBar.add(majors);
        mainBar.add(activities);

        file.add(exit);

        campus.add(smithField);
        campus.add(towns);
        campus.add(brissi);

        majors.add(technology);
        majors.add(science);
        majors.add(law);

        activities.add(sky);
        activities.add(scuba);
        activities.add(music);

        exit.addActionListener(this);
        smithField.addActionListener(this);
        towns.addActionListener(this);
        brissi.addActionListener(this);
        technology.addActionListener(this);
        science.addActionListener(this);
        law.addActionListener(this);
        sky.addActionListener(this);
        scuba.addActionListener(this);
        music.addActionListener(this);

        add(heading);
        heading.setFont(new Font("Arial", Font.BOLD, 14));
        add(description);
        description.setFont(new Font("Arial", Font.PLAIN, 14));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        String headingText = " ";
        String descriptionText = " ";

        if (source == exit) {
            System.exit(0);
        } else if (source == smithField) {
            headingText = "Junior College Smithfield Campus";
            descriptionText = "Located near the northern beaches in the suburb of Smithfield";
        } else if (source == towns) {
            headingText = "Junior College Townsville Campus";
            descriptionText = "The campus is located in the suburb of Douglas.";
        } else if (source == brissi) {
            headingText = "Junior College Brisbane Campus";
            descriptionText = "Brisbane is uniquely set up to cater to the modern day student";
        } else if (source == technology) {
            headingText = "Major - Information Technology";
            descriptionText = "Junior College Information Technology is a leader in design thinking.";
        } else if (source == science) {
            headingText = "Major - Science";
            descriptionText = "Junior College Science is a leader in discovering innovative solutions.";
        } else if (source == law) {
            headingText = "Major - Laws";
            descriptionText = "Law graduates benefit from a practical understanding of modern society";
        } else if (source == sky) {
            headingText = "Sky Diving";
            descriptionText = "College offers Discount to students for Sky Diving and concessions ";
        } else if (source == scuba) {
            headingText = "Scuba Diving";
            descriptionText = "College offers Discount to students for Scuba Diving and concessions ";
        } else if (source == music) {
            headingText = "Music Night (18+)";
            descriptionText = "College offers Discount to students for drinks and dine as well ";
        }

        heading.setText(headingText);
        description.setText(descriptionText);
    }

    public static void main(String[] args) {
        JavaJuniorCollege junior = new JavaJuniorCollege();
        final int WIDTH = 500;
        final int HEIGHT = 300;
        junior.setSize(WIDTH, HEIGHT);
        junior.setVisible(true);
    }
}