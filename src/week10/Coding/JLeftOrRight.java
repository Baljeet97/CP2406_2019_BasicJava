package week10.Coding;

import javax.swing.*;
import java.awt.event.*;

class JLeftOrRight extends JFrame implements MouseListener {

    JLabel label = new JLabel("Right Click or Left Click to see Value");

    private JLeftOrRight() {
        setTitle("Left Or Right");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(label);
        label.addMouseListener(this);
    }

    public static void main(String[] args) {
        JLeftOrRight lor = new JLeftOrRight();
        lor.setSize(300, 200);
        lor.setVisible(true);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Value: " + e.getModifiers());
    }
}
