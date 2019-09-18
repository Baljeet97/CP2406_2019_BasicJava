package week8.Coding.QUE4;

public class DomesticDivision extends Division {
    private String state;

    DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("\nDivision Name: " + divisionName + "\nAccount number: " + accountNumber + "\nState: " + state);
    }
}
