// This class determines the logarithm of a number
package week9.Task1;

public class FixDebugTwelve1 {
    public static void main(String[] args) throws ArithmeticException {
        double num = -8.8, result;

        try {
            if (num <= 0)
                throw (new ArithmeticException());
            result = Math.log(num);
            System.out.println("Result is " + result);
        } catch (ArithmeticException e) {
            System.out.println("Can't take logarithm for value of zero or lower");
        }
    }
}
