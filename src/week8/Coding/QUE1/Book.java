package week8.Coding.QUE1;

abstract class Book {
    private String title;
    double price;

    Book(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public abstract void setPrice();
}
