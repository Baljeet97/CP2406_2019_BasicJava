package week8.Coding.QUE1;

public class UseBook {
    public static void main(String[] args) {
        Fiction fiction = new Fiction("The Light We Cannot See");
        NonFiction nonFiction = new NonFiction("Silent Spring");

        System.out.println("Fiction book Title: " + fiction.getTitle() + "\nPrice: $" + fiction.getPrice());
        System.out.println("\nNon-Fiction book Title: " + nonFiction.getTitle() + "\nPrice: $" + nonFiction.getPrice());
    }
}
