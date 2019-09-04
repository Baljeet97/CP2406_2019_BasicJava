package week6;

import java.util.Scanner;

public class BabyNameComparison {

    public static void main(String[] args) {
        String[] names = new String[3];
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter 3 Name:");
        names[0] = userInput.nextLine();
        names[1] = userInput.nextLine();
        names[2] = userInput.nextLine();

        for (String firstName : names) {

            for (String newBabyName : names) {
                if (!newBabyName.equals(firstName)) {
                    System.out.println(firstName + "-" + newBabyName);
                }
            }
        }
    }
}
