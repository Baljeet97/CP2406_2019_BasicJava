package week6;

import java.util.Scanner;

public class CountMoviesSpaces {
    public static void main(String[] args) {
        //quote from TV series called SUITS
        String movieQuote = "Caring makes you weak: they think you care and they'll walk all over you";
        Scanner userInput = new Scanner(System.in);
        int spacesCount = 0;

        for (int i = 0; i < movieQuote.length(); i++)
            spacesCount += (Character.isWhitespace(movieQuote.charAt(i))) ? 1 : 0;
        System.out.println("Your Quote: " + movieQuote + "\nTotal number of spaces in Quote: " + spacesCount + " Spaces");
    }
}


