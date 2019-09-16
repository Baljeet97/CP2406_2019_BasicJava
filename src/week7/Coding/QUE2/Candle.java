package week7.Coding.QUE2;

public class Candle {
    private String color;
    private int height;
    int price;

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public int getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(int height) {
        final int pricePerInch = 2;
        this.height = height;
        price = height * pricePerInch;
    }
}
