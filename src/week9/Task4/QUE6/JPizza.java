package week9.Task4.QUE6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JPizza extends JFrame implements ItemListener {
    FlowLayout flow = new FlowLayout();
    Font font = new Font("Arial", Font.PLAIN, 20);
    JComboBox<String> toppings = new JComboBox<String>();
    JLabel pizzaToppings = new JLabel("Toppings");
    JComboBox<String> size = new JComboBox<String>();
    JLabel pizzaSize = new JLabel("Size");
    JTextField totprice = new JTextField(10);

    int totalPrice = 0;
    String output;
    int pPrice = 0;
    int bPrice = 0;
    int[] toppingPrice = {0, 0, 1, 1, 1, 1, 1};
    int[] basePrice = {0, 7, 9, 11, 14};

    public JPizza() {
        super("Pizzeria");
        setLayout(flow);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        size.addItem("None");
        size.addItem("Small");
        size.addItem("Medium");
        size.addItem("Large");
        size.addItem("XL");

        toppings.addItem("None");
        toppings.addItem("Cheese");
        toppings.addItem("Bacon");
        toppings.addItem("Beef");
        toppings.addItem("Ham");
        toppings.addItem("Pork");

        add(pizzaToppings);
        add(toppings);
        toppings.addItemListener(this);
        add(pizzaSize);
        add(size);
        size.addItemListener(this);

        add(totprice);
        totprice.setText("Total price");
    }

    public static void main(String[] arguments) {
        JPizza pizza = new JPizza();
        pizza.setSize(350, 150);
        pizza.setVisible(true);
    }


    @Override
    public void itemStateChanged(ItemEvent list) {
        Object source = list.getSource();
        if (source == toppings) {
            int pay = toppings.getSelectedIndex();
            pPrice = toppingPrice[pay];
            totalPrice = pPrice + bPrice;
            output = "Total Price: $" + totalPrice;
            totprice.setText(output);
        } else if (source == size) {
            int pay = size.getSelectedIndex();
            bPrice = basePrice[pay];
            totalPrice = bPrice + pPrice;
            output = "Total Price: $" + totalPrice;
            totprice.setText(output);
        }
    }
}