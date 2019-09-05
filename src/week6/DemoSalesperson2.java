package week6;

public class DemoSalesperson2 {

    public static void main(String[] args) {
        final int idNumber = 111;
        final double startedSales = 25000.0;
        final int increasedSales = 5000;

        Salesperson[] salesperson = new Salesperson[10];

        for (int i = 0; i < salesperson.length; ++i) {
            salesperson[i] = new Salesperson(idNumber, startedSales);
            salesperson[i].setIdNum(salesperson[i].getIdNum() + i);
            salesperson[i].setAnnualSalesAmount(salesperson[i].getAnnualSalesAmount() + (i * increasedSales));
            System.out.println("Salesperson " + (i + 1) + " ID number is " + salesperson[i].getIdNum() + " annual sales amount is $" + salesperson[i].getAnnualSalesAmount());
        }
    }
}
