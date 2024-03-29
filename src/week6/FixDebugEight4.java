package week6;
// Allows user to enter a series of words
// and displays them in reverse order

import javax.swing.*;
import java.util.ArrayList;

public class FixDebugEight4 {
    public static void main(String[] args) {
        int y;
        ArrayList<String> array = new ArrayList<>();
        String entry;
        final String STOP = "XXX";

        StringBuilder message = new
                StringBuilder("The words in reverse order are\n");

        entry = JOptionPane.showInputDialog(null,
                "Enter any word\n" +
                        "Enter " + STOP + " when you want to stop");
        while (!(entry.equals(STOP))) {
//            System.out.println(entry);
            array.add(entry);
            entry = JOptionPane.showInputDialog(null,
                    "Enter another word\n" +
                            "Enter " + STOP + " when you want to stop");

        }
        for (y = array.size() - 1; y >= 0; --y) {
            message.append(array.get(y));
            message.append("\n");
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
