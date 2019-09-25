package week9.Task4.QUE1;

import javax.swing.*;
import java.awt.*;

public class JBookQuote extends JFrame {
    FlowLayout flow = new FlowLayout();
    JLabel label = new JLabel("A screaming comes across the sky.");

    private JBookQuote() {
        super("Book Quote");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(flow);
        add(label);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        JBookQuote aFrame = new JBookQuote();
    }
}
