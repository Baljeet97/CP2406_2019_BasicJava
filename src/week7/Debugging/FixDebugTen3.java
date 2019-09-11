package week7.Debugging;

// A PhoneBook is a Book with a city

import javax.swing.*;

import static java.lang.Integer.parseInt;

public class FixDebugTen3 {
    public static void main(String[] args) {
        String area, inStr;
        int pages;
        area = JOptionPane.showInputDialog(null,
                "Enter city for phone book");
        inStr = JOptionPane.showInputDialog(null,
                "Enter number of pages in " + area + "'s phone book");
        pages = parseInt(inStr);
        FixDebugPhoneBook pb = new FixDebugPhoneBook(pages, area);
        pb.display();
    }
}