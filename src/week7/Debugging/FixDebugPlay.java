package week7.Debugging;

public class FixDebugPlay {
    String title;
    String author;

    public FixDebugPlay(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("The performance is " + title +
                " by " + author);
    }
}