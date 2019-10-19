package week12.Coding;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class JSmileFacePanel2 extends JPanel implements ActionListener {
    JButton mood = new JButton("Change mood");
    int count = 0;
    boolean isHappy = true;

    public JSmileFacePanel2() {
        add(mood);
        mood.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (count % 2 == 0)
            isHappy = false;
        else
            isHappy = true;
        ++count;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 100, 100);
        g.setColor(Color.BLACK);
        g.fillOval(80, 75, 10, 10);
        g.fillOval(105, 75, 10, 10);
        if (isHappy)
            g.drawArc(75, 75, 50, 50, 200, 140);
        else
            g.drawArc(75, 100, 50, 50, 20, 140);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JSmileFacePanel2());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 230);
        frame.setVisible(true);
    }
}