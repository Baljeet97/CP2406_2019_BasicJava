package week6;

public class DemoSalesperson {
    public static void main(String[] args) {
        final double salesAmount = 0.0;
        final int idNumber = 9999;

        Salesperson[] salesperson = new Salesperson[10];

        for (int i = 0; i < salesperson.length; ++i) {
            salesperson[i] = new Salesperson(idNumber, salesAmount);
            System.out.println("Salesperson " + (i + 1) + " ID number is " + salesperson[i].getIdNum() + " annual sales amount is $" + salesperson[i].getAnnualSalesAmount());
        }
    }
}
