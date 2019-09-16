package week7.Coding.QUE2;

public class DemoCandle {

    public static void main(String[] args) {

        Candle macintosh = new Candle();
        macintosh.setColor("Red");
        macintosh.setHeight(12);

        ScentedCandle pinkSands = new ScentedCandle();
        pinkSands.setColor("Pink");
        pinkSands.setHeight(15);
        pinkSands.setScent("Floral and Citrus");

        System.out.println("Unscented Candle" + "\nColor: " + macintosh.getColor() + "\nHeight(in Inches): " + macintosh.getHeight() + "\nPrice per Inch: $" + macintosh.getPrice());
        System.out.println();
        System.out.println("Scented Candle" + "\nColor: " + pinkSands.getColor() + "\nHeight(in Inches): " + pinkSands.getHeight() + "\nPrice Per Inch: $" + pinkSands.getPrice() + "\nScent: " + pinkSands.getScent());
    }
}
