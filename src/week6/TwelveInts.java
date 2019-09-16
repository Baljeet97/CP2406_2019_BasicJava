package week6;

public class TwelveInts {

    public static void main(String[] args) {
        int[] arrayOfNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        for (int arrayOfNum : arrayOfNums) {
            System.out.println(arrayOfNum);
        }

        System.out.println();

        for (int j = arrayOfNums.length - 1; j >= 0; --j) {
            System.out.println(arrayOfNums[j]);
        }
    }
}
