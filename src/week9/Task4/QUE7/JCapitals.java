package week9.Task4.QUE7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCapitals extends JFrame implements ItemListener {

    String output;
    String selectedCountry;
    int countryIndex;
    FlowLayout flow = new FlowLayout();
    Font font = new Font("Arial", Font.PLAIN, 20);
    JComboBox<String> country = new JComboBox<String>();
    JLabel countryList = new JLabel("Select a country");
    String[] capitals = {
            "Select A Country",
            "Buenos Aires",
            "Brasilia",
            "Athens",
            "Hanoi",
            "Madrid",
            "Lisbon",
            "Oslo"};

    JLabel caps = new JLabel("Capital");
    JTextField displayCapital = new JTextField(20);

    private JCapitals() {
        super("Capitals");

        setSize(500, 400);
        setLayout(flow);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        add(countryList);
        add(country);
        add(caps);

        country.addItem("Choose");
        country.addItem("Argentina");
        country.addItem("Brazil");
        country.addItem("Greece");
        country.addItem("Vietnam");
        country.addItem("Spain");
        country.addItem("Portugal");
        country.addItem("Norway");
        country.addItemListener(this);

        add(displayCapital);
        displayCapital.setText("Select a country");
    }

    public static void main(String[] args) {
        JCapitals caps = new JCapitals();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Object source = e.getSource();
        if (source == country) {
            countryIndex = country.getSelectedIndex();
            selectedCountry = " " + capitals[countryIndex];
            output = selectedCountry;
            displayCapital.setText(output);
        }
    }
}
