package week8.Coding.QUE4;

public class InternationalDivision extends Division {
    private String country;
    private String language;

    InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("Division Name: " + divisionName + "\nAccount number: " + accountNumber + "\nCountry: " + country
                + "\nLanguage: " + language);
    }
}
