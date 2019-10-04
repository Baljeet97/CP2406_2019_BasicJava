package week10.Coding;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFontSelector extends JFrame implements ActionListener {
    final int smallSize = 10;
    final int largeSize = 25;
    boolean isSmall = true;

    JButton serifButton = new JButton("Serif");
    JButton arialButton = new JButton("Arial");
    JButton timesRomanButton = new JButton("Times New Roman");
    JButton monospacedButton = new JButton("Monospaced");
    JButton algerianButton = new JButton("Serif");
    JButton sizeButton = new JButton("Small/Large");

    JLabel demo = new JLabel("Font Demonstration");

    Font serifFont = new Font("Serif", Font.PLAIN, smallSize);
    Font arialFont = new Font("Arial", Font.PLAIN, smallSize);
    Font timesRomanFont = new Font("Times New Roman", Font.PLAIN, smallSize);
    Font monospacedFont = new Font("Monospaced", Font.PLAIN, smallSize);
    Font algerianFont = new Font("Algerian", Font.PLAIN, smallSize);
    Font currentFont = monospacedFont;


    public JFontSelector() {
        setTitle("Font Selector");
        setSize(500, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(serifButton);
        add(arialButton);
        add(timesRomanButton);
        add(monospacedButton);
        add(algerianButton);
        add(sizeButton);
        add(demo);
        demo.setFont(currentFont);

        serifButton.addActionListener(this);
        arialButton.addActionListener(this);
        timesRomanButton.addActionListener(this);
        monospacedButton.addActionListener(this);
        algerianButton.addActionListener(this);
        sizeButton.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == serifButton) {
            currentFont = serifFont;
        } else if (source == arialButton) {
            currentFont = arialFont;
        } else if (source == timesRomanButton) {
            currentFont = timesRomanFont;
        } else if (source == monospacedButton) {
            currentFont = monospacedFont;
        } else if (source == algerianButton) {
            currentFont = algerianFont;
        } else if (source == sizeButton) {
            if (isSmall) {
                currentFont = currentFont.deriveFont(Font.BOLD, largeSize);
                isSmall = false;
            } else {
                currentFont = currentFont.deriveFont(Font.PLAIN, smallSize);
                isSmall = true;
            }
        }
        demo.setFont(currentFont);
    }

    public static void main(String[] args) {
        JFontSelector font = new JFontSelector();
    }
}