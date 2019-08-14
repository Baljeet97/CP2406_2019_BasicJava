package week3;

import java.util.Random;
import java.util.Scanner;


/*GameTest is not working, need to use win and count to make it work.*/
public class Game {

    public static void main(String[] args) {

        Random random = new Random();
        int secret = random.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a Number :");
        int userInput = scanner.nextInt();
        if (userInput == secret) {

            System.out.println("You won");
        } else {

            System.out.println("You lost");
        }


    }

}

//    private Random random = new Random();
//    int secret = random.nextInt(10) + 1;
//
//    int count;
//    int wins;
//
//    void makeGuess(int value){
//        count++;
//            if (value == secret){
//                wins++;
//        }
//
//    }
//}
