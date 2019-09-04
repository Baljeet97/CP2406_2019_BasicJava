package week6;

public class ArrayMethodDemo {

    public static void main(String[] args) {

        int[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        allIntegers(integers);
        reverseIntegers(integers);
        sumOfIntegers(integers);
        limitedArgument(6, integers);
        integersAboveAvg(integers);
    }

    private static void allIntegers(int[] integers) {
        System.out.println("All Integers");

        for (int i = 0; i < integers.length; i++) {
            System.out.println(i);
        }
    }

    private static void reverseIntegers(int[] integers) {
        System.out.println("\nIntegers in reverse");

        for (int i = integers.length - 1; i >= 0; --i) {
            System.out.println(i + 1);
        }
    }

    private static void sumOfIntegers(int[] integers) {
        int sum = 0;
        for (int i : integers) {
            sum += i;
        }
        System.out.println("\nSum of Integers: " + sum);
    }

    private static void limitedArgument(int limit, int[] integers) {
        System.out.println("\nIntegers less than " + limit + ": ");
        for (int i : integers) {
            if (i < limit) {
                System.out.println(i);

            }
        }
    }

    private static void integersAboveAvg(int[] integers) {
        int avg = 0;
        for (int i : integers)
            avg += i;
        avg = avg / integers.length;
        System.out.println("\nAverage: " + avg);

        System.out.println("Integers greater than average: ");
        for (int i : integers)
            if (i > avg)
                System.out.println(i);
    }

}
