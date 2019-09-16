package week7.Coding.QUE2;

public class ScentedCandle extends Candle{

    private String scent;

    public void setScent(String scent) {
        this.scent = scent;
    }

    public String getScent() {
        return scent;
    }

    @Override
    public void setHeight(int height){
        final int pricePerInch = 3;
        super.setHeight(height);
        price = height * pricePerInch;

    }

}
