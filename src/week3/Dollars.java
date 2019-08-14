package week3;

import java.util.Scanner;


public class Dollars {


    public static void main(String[] args) {

        int twinties;
        int amount;
        int tens;
        int fives;
        int ones;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Amount :");
        amount = input.nextInt();
        /*Need a way to use modulo*/
        twinties = amount / 20;
        amount = amount - 20 * twinties;
        tens = amount / 10;
        amount = amount - 10 * tens;
        fives = amount / 5;
        ones = amount - 5 * fives;


        System.out.println("Currency denominations: " + "\n" + "Twenties: " + twinties + "\n" + "Tens: " + tens + "\n" + "Fives: " + fives + "\n" + "One: " + ones);


    }
}


