package week6;

public class Salesperson {

    private int idNum;
    private double annualSalesAmount;

    public Salesperson(int idNum, double saleAmount) {
        this.idNum = idNum;
        this.annualSalesAmount = saleAmount;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int newId) {
        idNum = newId;
    }

    public double getAnnualSalesAmount() {
        return annualSalesAmount;
    }

    public void setAnnualSalesAmount(double newSaleAmount) {
        annualSalesAmount = newSaleAmount;
    }

}
