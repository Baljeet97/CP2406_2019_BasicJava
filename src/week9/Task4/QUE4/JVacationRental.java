package week9.Task4.QUE4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JVacationRental extends JFrame implements ItemListener {
    int totalPrice;
    String output;
    final int PARKSIDE = 600;
    final int LAKESIDE = 825;
    final int POOLSIDE = 750;
    final int ONEROOM = 0;
    final int TWOROOMS = 75;
    final int THREEROOMS = 150;
    final int MEAL = 200;
    final int NOMEAL = 0;

    FlowLayout layout = new FlowLayout();
    Font font = new Font("Arial", Font.PLAIN, 24);

    JPanel locationPanel = new JPanel(layout);
    ButtonGroup location = new ButtonGroup();
    JLabel locationsTitle = new JLabel("Locations-");
    JCheckBox parkSide = new JCheckBox("Park Side", false);
    JCheckBox poolSide = new JCheckBox("Pool Side", false);
    JCheckBox lakeSide = new JCheckBox("Lake Side", false);

    JPanel bedroomPanel = new JPanel(layout);
    ButtonGroup bedRoom = new ButtonGroup();
    JLabel bedRoomTitle = new JLabel("Bedrooms-");
    JCheckBox oneRoom = new JCheckBox("One", false);
    JCheckBox twoRoom = new JCheckBox("Two", false);
    JCheckBox threeRoom = new JCheckBox("Three", false);

    JPanel mealPanel = new JPanel(layout);
    ButtonGroup meal = new ButtonGroup();
    JLabel mealTitle = new JLabel("Meal-");
    JCheckBox withMeal = new JCheckBox("Meal Included", false);
    JCheckBox noMeal = new JCheckBox("No Meal Included", false);

    JTextField totPrice = new JTextField(30);


    private JVacationRental() {
        super("Vacation Rental");
        setSize(500, 400);
        setLayout(layout);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        //locations
        add(locationPanel);
        locationPanel.add(locationsTitle);
        locationPanel.add(parkSide);
        locationPanel.add(poolSide);
        locationPanel.add(lakeSide);
        location.add(parkSide);
        location.add(poolSide);
        location.add(lakeSide);
        parkSide.addItemListener(this);
        poolSide.addItemListener(this);
        lakeSide.addItemListener(this);


        //bedrooms
        add(bedroomPanel);
        bedroomPanel.add(bedRoomTitle);
        bedroomPanel.add(oneRoom);
        bedroomPanel.add(twoRoom);
        bedroomPanel.add(threeRoom);
        bedRoom.add(oneRoom);
        bedRoom.add(twoRoom);
        bedRoom.add(threeRoom);
        oneRoom.addItemListener(this);
        twoRoom.addItemListener(this);
        threeRoom.addItemListener(this);

        //Meal
        add(mealPanel);
        mealPanel.add(mealTitle);
        mealPanel.add(withMeal);
        mealPanel.add(noMeal);
        meal.add(withMeal);
        meal.add(noMeal);
        withMeal.addItemListener(this);
        noMeal.addItemListener(this);

        add(totPrice);
        totPrice.setText("Choose location, bedroom, and meal for price");
    }

    public static void main(String[] args) {
        JVacationRental vacation = new JVacationRental();
    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        Object source = e.getItem();
        if (source == parkSide) {
            int select = e.getStateChange();
            if (select == ItemEvent.SELECTED)
                totalPrice += PARKSIDE;
            else if (select == ItemEvent.DESELECTED)
                totalPrice -= PARKSIDE;
            output = " $" + totalPrice;
            totPrice.setText(output);
        } else if (source == poolSide) {
            int select = e.getStateChange();
            if (select == ItemEvent.SELECTED)
                totalPrice += POOLSIDE;
            else if (select == ItemEvent.DESELECTED)
                totalPrice -= POOLSIDE;
            output = " $" + totalPrice;
            totPrice.setText(output);
        } else if (source == lakeSide) {
            int select = e.getStateChange();
            if (select == ItemEvent.SELECTED)
                totalPrice += LAKESIDE;
            else if (select == ItemEvent.DESELECTED)
                totalPrice -= LAKESIDE;
            output = " $" + totalPrice;
            totPrice.setText(output);
        } else if (source == oneRoom) {
            int select = e.getStateChange();
            if (select == ItemEvent.SELECTED)
                totalPrice += ONEROOM;
            else if (select == ItemEvent.DESELECTED)
                totalPrice -= ONEROOM;
            output = " $" + totalPrice;
            totPrice.setText(output);
        } else if (source == twoRoom) {
            int select = e.getStateChange();
            if (select == ItemEvent.SELECTED)
                totalPrice += TWOROOMS;
            else if (select == ItemEvent.DESELECTED)
                totalPrice -= TWOROOMS;
            output = " $" + totalPrice;
            totPrice.setText(output);
        } else if (source == threeRoom) {
            int select = e.getStateChange();
            if (select == ItemEvent.SELECTED)
                totalPrice += THREEROOMS;
            else if (select == ItemEvent.DESELECTED)
                totalPrice -= THREEROOMS;
            output = " $" + totalPrice;
            totPrice.setText(output);
        } else if (source == noMeal) {
            int select = e.getStateChange();
            if (select == ItemEvent.SELECTED)
                totalPrice += NOMEAL;
            else if (select == ItemEvent.DESELECTED)
                totalPrice -= NOMEAL;
            output = " $" + totalPrice;
            totPrice.setText(output);
        } else if (source == withMeal) {
            int select = e.getStateChange();
            if (select == ItemEvent.SELECTED)
                totalPrice += MEAL;
            else if (select == ItemEvent.DESELECTED)
                totalPrice -= MEAL;
            output = " $" + totalPrice;
            totPrice.setText(output);
        }
    }
}