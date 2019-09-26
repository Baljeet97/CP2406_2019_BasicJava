package week9.Task4.QUE3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JHistoricalFacts extends JFrame implements ActionListener {
    private FlowLayout layout = new FlowLayout();
    int index;
    private JButton button = new JButton("Historical facts");
    JLabel[] labels = {
            new JLabel("Turkeys Were Once Worshipped Like Gods"),
            new JLabel("Paul Revere Never Actually Shouted, “The British Are Coming"),
            new JLabel("Captain Morgan Actually Existed"),
            new JLabel("The Titanic‘s Owners Never Said the Ship Was “Unsinkable”"),
            new JLabel("Cars Weren’t Invented in the United States")};
    JLabel quotes = new JLabel("");


    public JHistoricalFacts() {
        super("Historical Facts");
        setLayout(layout);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 500);
        add(button);
        add(quotes);
        button.addActionListener(this);
    }

    public static void main(String[] args) {
        JHistoricalFacts facts = new JHistoricalFacts();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (index) {
            case 0:
                quotes.setText(labels[0].getText());
                break;
            case 1:
                quotes.setText(labels[1].getText());
                break;
            case 2:
                quotes.setText(labels[2].getText());
                break;
            case 3:
                quotes.setText(labels[3].getText());
                break;
            case 4:
                quotes.setText(labels[4].getText());
                break;
        }

        if (index == 4) {
            index = 0;
        } else ++index;
    }
}

