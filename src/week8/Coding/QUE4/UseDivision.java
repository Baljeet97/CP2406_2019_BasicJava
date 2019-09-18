package week8.Coding.QUE4;

public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision international = new InternationalDivision("International", 4548, "Scotland", "Scottish Gaelic");
        DomesticDivision domestic = new DomesticDivision("Domestic", 4648, "QLD");

        international.display();
        domestic.display();
    }
}
