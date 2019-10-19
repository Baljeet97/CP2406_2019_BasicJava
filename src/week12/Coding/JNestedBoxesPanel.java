package week12.Coding;

import javax.swing.*;
import java.awt.*;

public class JNestedBoxesPanel extends JPanel {
    int totalBoxes = 8;
    int sizeInc = 20;
    int x = 10;
    int y = 10;
    int height = 300;
    int width = 300;

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for (int i = 0; i < totalBoxes; ++i){
            g.drawRect(x,y,width,height);
            width -= sizeInc*2;
            height -= sizeInc*2;
            y += sizeInc;
            x +=sizeInc;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JNestedBoxesPanel());
        frame.setSize(360, 380);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
