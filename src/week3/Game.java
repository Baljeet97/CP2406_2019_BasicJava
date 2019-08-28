package week3;

import java.util.Random;
import java.util.Scanner;


/*GameTest is not working, need to use win and count to make it work.*/
public class Game {

    int count;
    int wins;
    private Random random = new Random();
    int secret;

    public Game(int min, int max) {
        secret = min + random.nextInt(max - min + 1);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Game game = new Game(1, 10);
        System.out.println("Guess a Number between 0 and 10: ");
        int userInput = scanner.nextInt();
        game.makeGuess(userInput);
        if (game.wins > 0) {

            System.out.println("You won");
        } else {

            System.out.println("You lost");
        }

    }


    void makeGuess(int value) {
        count++;
        if (value == secret) {
            wins++;
        }

    }
}
