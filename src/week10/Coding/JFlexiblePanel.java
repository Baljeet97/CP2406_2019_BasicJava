package week10.Coding;

import javax.swing.*;
import java.awt.*;

public class JFlexiblePanel extends JPanel {
    Color background;
    Color foreground;
    Font font;
    String str;
    JLabel label = new JLabel();

    public JFlexiblePanel(Color background, Color foreground, Font font, String str){
        this.background = background;
        this.foreground = foreground;
        this.font = font;
        this.str = str;

        this.add(label);
        label.setText(str);
        label.setFont(font);
        this.setBackground(background);
        this.setForeground(foreground);
    }
}
