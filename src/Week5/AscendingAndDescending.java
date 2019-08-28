package Week5;

import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 Numbers:");
        int intOne = input.nextInt();
        int intTwo = input.nextInt();
        int intThree = input.nextInt();

        int smallestInt = 0;
        int mediumInt = 0;
        int largestInt = 0;
        if (intOne < intTwo && intOne < intThree) {
            if (intTwo < intThree) {

                smallestInt = intOne;
                mediumInt = intTwo;
                largestInt = intThree;
            }
        }
        System.out.println("Ascending Order: " + smallestInt + " " + mediumInt + " " + largestInt);
        System.out.println("Descending Order: " + largestInt + " " + mediumInt + " " + smallestInt);
    }

}




