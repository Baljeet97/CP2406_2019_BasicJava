package week7.Coding.QUE8;

public class CollegeCourse {
    private String department;
    private int courseNumber;
    private int credits;
    private int fees;

    CollegeCourse(String department, int courseNumber, int credits) {
        this.department = department;
        this.courseNumber = courseNumber;
        this.credits = credits;
        calculateFees();
    }

    private void calculateFees() {
        fees = 120 * credits;
    }

    void extraCost(int extraCost) {
        fees += extraCost;
    }

    void display() {
        System.out.println("The course is in department: " + department + "\nCourse Number: " + courseNumber +
                "\nCredits: " + credits + "\nFees: $" + fees);
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public int getCredits() {
        return credits;
    }

    public int getFees() {
        return fees;
    }

    public String getDepartment() {
        return department;
    }
}
