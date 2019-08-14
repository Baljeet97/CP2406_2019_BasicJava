package week3;




public class InchesToFeet {
    public static void main(String[] args){
        final int ONE_FEET = 12;
        int inches = 86;
        int inchesToFeet = inches/ONE_FEET;
        int remainingInches = inches%ONE_FEET;

        System.out.println("inches" + inches + " become : " + inchesToFeet + " Feet and " + remainingInches + " inches");
    }



}
