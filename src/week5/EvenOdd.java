package week5;

import javax.swing.*;

public class EvenOdd {
    public static void main(String[] args) {


        int userInputInt;
        String output;
        String userInputStr;


        userInputStr = JOptionPane.showInputDialog(null, "Enter a Number");
        userInputInt = Integer.parseInt(userInputStr);


        if (userInputInt % 2 == 0) {
            output = "Number is Even";
        } else output = "Number is Odd";
        JOptionPane.showMessageDialog(null, output);


    }
}
