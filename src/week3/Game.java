package week3;

import java.util.Random;

public class Game {

    private Random random = new Random();
    int secret = random.nextInt(10) + 1;

    int count;
    int wins;

    void makeGuess(int value){
        count++;
        if (value == secret){
            wins++;

        }

    }
}
