package week4_Refreshed;

public class Student {
    private int id;
    private double creditHoursEarned;
    private double pointsEarned;

    public Student() {
        id = 9999;
        pointsEarned = 12;
        creditHoursEarned = 3;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCreditHoursEarned() {
        return creditHoursEarned;
    }

    public void setCreditHoursEarned(double creditHoursEarned) {
        this.creditHoursEarned = creditHoursEarned;
    }

    public double getPointsEarned() {
        return pointsEarned;
    }

    public void setPointsEarned(double pointsEarned) {
        this.pointsEarned = pointsEarned;
    }


    public double gpa() {

        return pointsEarned / creditHoursEarned;

    }

}
