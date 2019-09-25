// An employee ID can't be more than 999
// Keep executing until user enters four valid employee IDs
// This program throws a FixDebugEmployeeIDException
package week9.Task1;

import javax.swing.*;

public class FixDebugTwelve4 {
    public static void main(String[] args) {
        String inStr;
        StringBuilder outString = new StringBuilder();
        final int MAX = 999;
        int[] emp = new int[4];

        for (int x = 0; x < emp.length; ++x) {
            inStr = JOptionPane.showInputDialog(null, "Enter employee ID number");
            try {
                emp[x] = Integer.parseInt(inStr);
                if (emp[x] > MAX) {
                    throw (new FixDebugEmployeeIDException());
                }
            } catch (NumberFormatException error) {
                --x;
                JOptionPane.showMessageDialog(null, inStr + "\nNon-numeric ID");
            } catch (FixDebugEmployeeIDException error) {
                --x;
                JOptionPane.showMessageDialog(null, inStr + " \nNumber too High");
            }
        }
        for (int i : emp) {
            outString.append(i).append(" ");
        }
        JOptionPane.showMessageDialog(null, "Four valid IDS are: " + outString);
    }
}
