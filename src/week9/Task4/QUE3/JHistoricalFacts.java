package week9.Task4.QUE3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JHistoricalFacts extends JFrame implements ActionListener {
    private FlowLayout layout = new FlowLayout();
    int index;
    private JButton button = new JButton("Historical facts");
    String[] labels = {
            "Turkeys Were Once Worshipped Like Gods",
            "Paul Revere Never Actually Shouted, “The British Are Coming",
            "Captain Morgan Actually Existed",
            "The Titanic‘s Owners Never Said the Ship Was “Unsinkable”",
            "Cars Weren’t Invented in the United States"};
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
                quotes.setText(labels[0]);
                break;
            case 1:
                quotes.setText(labels[1]);
                break;
            case 2:
                quotes.setText(labels[2]);
                break;
            case 3:
                quotes.setText(labels[3]);
                break;
            case 4:
                quotes.setText(labels[4]);
                break;
        }

        if (index == 4) {
            index = 0;
        } else ++index;
    }
}

