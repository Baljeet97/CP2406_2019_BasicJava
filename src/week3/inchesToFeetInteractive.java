package week3;
import java.util.Scanner;

public class inchesToFeetInteractive {

    public static void main(String[] args){
        final int ONE_FEET = 12;
        int inches;
        int inchesToFeet;
        int remainingInches;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter inches :");
        inches = input.nextInt();
        inchesToFeet = inches/ONE_FEET;
        remainingInches = inches%ONE_FEET;
        System.out.println(inches + " inches" + " become : " + inchesToFeet + " Feet and " + remainingInches + " inches.");


    }
}
