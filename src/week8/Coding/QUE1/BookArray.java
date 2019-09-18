package week8.Coding.QUE1;

public class BookArray {
    public static void main(String[] args) {
        Book[] books = {
                new Fiction("Fiction"),
                new Fiction("Fiction"),
                new NonFiction("Non-Fiction"),
                new Fiction("Fiction"),
                new Fiction("Fiction"),
                new NonFiction("Non-Fiction"),
                new NonFiction("Non-Fiction"),
                new Fiction("Fiction"),
                new NonFiction("Non-Fiction"),
                new Fiction("Fiction")
        };

        for (Book book : books) {
            book.setPrice();
            System.out.println("Book: " + book.getTitle());
            System.out.println("Price: $" + book.getPrice());
            System.out.println(" ");
        }
    }
}
