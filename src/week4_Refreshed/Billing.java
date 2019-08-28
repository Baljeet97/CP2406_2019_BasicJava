package week4_Refreshed;

public class Billing {
    private final static double TAX = 0.08;


    public double computeBill(int price) {
        return (price + (price * TAX));

    }

    public double computeBill(int price, int numOfBooks) {

        double tax = price * TAX;
        double totalCost = price * numOfBooks;
        return tax + totalCost;

    }


    public double computeBill(int price, int numOfBooks, double coupon) {
        double totalCost = (price * numOfBooks) - coupon;
        double tax = price * TAX;
        return tax + totalCost;

    }

}
