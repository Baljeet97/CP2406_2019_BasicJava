package week6;

public class DemoSalesperson {


    public static void main(String[] args) {
        Salesperson[] salesperson = new Salesperson[10];

        for (int i = 0; i < salesperson.length; ++i) {
            salesperson[i] = new Salesperson(9999, 0.0);
            System.out.println("Salesperson " + (i + 1) + " ID number is " + salesperson[i].getIdNum() + " annual sales amount is $" + salesperson[i].getAnnualSalesAmount());
        }
    }
}
