package Week5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 Numbers:");
        numbers[0] = input.nextInt();
        numbers[1] = input.nextInt();
        numbers[2] = input.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int newNumber = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = newNumber;
                }
            }
        }

        System.out.println("Ascending Oder: ");
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println(numbers[numbers.length - 1]);

        System.out.println("Descending Oder: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);

        }
    }
}






