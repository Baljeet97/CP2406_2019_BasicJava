package week12.Coding;

import javax.swing.*;
import java.awt.*;

public class JFontSizesPanel extends JPanel {
    String msg = "Yes, It is true!";
    int minFontSize = 6;
    int maxFontSize = 20;
    int positionX = 50;
    int positionY = 10;
    int space = 20;
    Font myFont;

    @Override
    public void paintComponent(Graphics g) {
        for (int i = minFontSize; i <= maxFontSize; ++i) {
            myFont = new Font("Arial", Font.PLAIN, i);
            g.setFont(myFont);
            g.drawString(msg, positionX, positionY);
            positionY += space;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JFontSizesPanel());
        frame.setVisible(true);
        frame.setSize(300, 360);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}