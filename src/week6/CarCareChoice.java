package week6;

import java.util.Scanner;

public class CarCareChoice {
    public static void main(String[] args) {
        String[] availableService = {"oil change", "tire rotation", "battery check", "brake check"};
        int[] price = {25, 22, 15, 5};

        Scanner userInput = new Scanner(System.in);
        System.out.println("Select one service: \n");

        for (String s : availableService) {
            System.out.println(s);
        }

        String selectedService = userInput.nextLine();

        for (int x = 0; x < availableService.length; x++) {

            if (availableService[x].equals(selectedService))
                System.out.println("Price is: $" + price[x]);
        }
    }
}
