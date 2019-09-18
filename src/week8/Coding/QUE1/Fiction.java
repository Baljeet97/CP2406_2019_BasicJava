package week8.Coding.QUE1;

public class Fiction extends Book {
    public Fiction(String title) {
        super(title);
        this.setPrice();
    }

    @Override
    public void setPrice() {
        price = 24.99;
    }
}
