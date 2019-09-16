package week6;

import java.util.Scanner;

public class CountMovieSpaces2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Type in your favourite movie quote: ");
        String movieQuote = userInput.nextLine();
        int spacesCount = 0;

        for (int i = 0; i < movieQuote.length(); i++)
            spacesCount += (Character.isWhitespace(movieQuote.charAt(i))) ? 1 : 0;
        System.out.println("Your Quote: " + movieQuote + "\nTotal number of spaces in Quote: " + spacesCount + " Spaces");
    }
}
