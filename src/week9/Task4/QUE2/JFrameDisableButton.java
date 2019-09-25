package week9.Task4.QUE2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton extends JFrame implements ActionListener {
    FlowLayout layout = new FlowLayout();
    JButton button = new JButton("Click Me!");
    JLabel label = new JLabel("Click button to disable it");

    public JFrameDisableButton() {
        super("Disable Button");
        setLayout(layout);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(label);
        add(button);
        button.addActionListener(this);
        setSize(300, 350);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrameDisableButton disableButton = new JFrameDisableButton();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setEnabled(false);
    }
}
