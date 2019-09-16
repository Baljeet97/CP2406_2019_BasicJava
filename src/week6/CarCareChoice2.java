package week6;

import java.util.Scanner;

public class CarCareChoice2 {
    public static void main(String[] args) {
        String[] availableService = {"oil change", "tire rotation", "battery check", "brake inspection"};
        int[] price = {25, 22, 15, 5};

        Scanner userInput = new Scanner(System.in);
        System.out.println("Services:");
        for (String s : availableService) {
            System.out.println(s);
        }

        System.out.println("\nEnter first three Characters of Services to select : ");
        String selectedService = userInput.nextLine();

        for (int x = 0; x < availableService.length; x++) {

            if (availableService[x].substring(0, 3).equals(selectedService.substring(0, 3)))
                System.out.println("Price is: $" + price[x]);
        }
    }
}