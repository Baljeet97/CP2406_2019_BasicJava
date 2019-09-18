package week8.Coding.QUE1;

public class NonFiction extends Book {
    public NonFiction(String title) {
        super(title);
        this.setPrice();
    }

    @Override
    public void setPrice() {
        price = 37.99;
    }
}
