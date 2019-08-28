package week5;

import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args) {
        final int sentinel = 999;

        Scanner scanner = new Scanner(System.in);

        int userInput = 0;

        while (userInput != sentinel) {
            System.out.println("Enter an even number or 999 to exit: ");
            userInput = scanner.nextInt();
            if (userInput % 2 == 0)
                System.out.println("Good Job");
            else if (userInput != sentinel)
                System.out.println("Error: Odd number.");
        }
    }
}
