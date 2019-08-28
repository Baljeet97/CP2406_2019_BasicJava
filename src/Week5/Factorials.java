package Week5;

public class Factorials {
    public static void main(String[] args) {
        final int MAX = 10;
        int factorial = 1;

        for (int i = 1; i <= MAX; i++) {
            factorial = factorial * i;
            System.out.println("The factorial of " + i + " is " + factorial);
        }
    }
}

