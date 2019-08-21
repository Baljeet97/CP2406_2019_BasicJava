package week4_Refreshed;

public class Sandwich {
    private String ingredient;
    private String breadType;
    private double price;




    Sandwich(String ingredient, String breadType, double price){
        setIngredient(ingredient);
        this.breadType = breadType;
        this.price = price;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
