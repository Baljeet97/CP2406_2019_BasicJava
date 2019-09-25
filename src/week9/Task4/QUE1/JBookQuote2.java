package week9.Task4.QUE1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuote2 extends JFrame implements ActionListener {
    FlowLayout flow = new FlowLayout();
    JButton button = new JButton("Click for Novel name");
    JLabel label = new JLabel("A screaming comes across the sky.");

    private JBookQuote2() {
        super("Book Quote");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(flow);
        add(label);
        add(button);
        button.addActionListener(this);
    }

    public static void main(String[] args) {
        JBookQuote2 aFrame = new JBookQuote2();
        aFrame.setSize(300, 200);
        aFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Gravity's Rainbow");
    }
}
