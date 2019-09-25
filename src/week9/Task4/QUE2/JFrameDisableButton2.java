package week9.Task4.QUE2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton2 extends JFrame implements ActionListener {
    final int MAX = 8;
    int count = 0;
    FlowLayout layout = new FlowLayout();
    JButton button = new JButton("Click Me!");
    JLabel label = new JLabel();

    public JFrameDisableButton2() {
        super("Disable Button");
        setLayout(layout);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(button);
        add(label);
        button.addActionListener(this);
        setSize(300, 350);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrameDisableButton2 disableButton = new JFrameDisableButton2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ++count;
        if (count == MAX) {
            button.setEnabled(false);
            label.setText("That's Enough");
        }
    }
}