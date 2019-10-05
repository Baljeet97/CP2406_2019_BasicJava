package week10.Coding;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo extends JFrame {
    Container container = null;

    JFlexiblePanel panel1 = new JFlexiblePanel(Color.red, Color.gray, new Font("Arial", Font.BOLD, 20), "Panel 1");
    JFlexiblePanel panel2 = new JFlexiblePanel(Color.green, Color.blue, new Font("Algerian", Font.PLAIN, 20), "Panel 2");
    JFlexiblePanel panel3 = new JFlexiblePanel(Color.cyan, Color.orange, new Font("Helvetica", Font.PLAIN, 20), "Panel 3");
    JFlexiblePanel panel4 = new JFlexiblePanel(Color.blue, Color.red, new Font("Courier", Font.PLAIN, 20), "Panel 4");

    public JPanelDemo() {
        container = this.getContentPane();
        container.setLayout(new GridLayout(2, 2));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        container.add(panel1);
        container.add(panel2);
        container.add(panel3);
        container.add(panel4);
    }

    public static void main(String[] args) {
        JPanelDemo demo = new JPanelDemo();
        demo.setVisible(true);
        demo.setSize(300, 200);
    }
}
