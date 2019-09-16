package week7.Coding.QUE8;

public class LabCourse extends CollegeCourse {
    LabCourse(String department, int courseNumber, int credits) {
        super(department, courseNumber, credits);
        super.extraCost(50);
    }

    @Override
    void display() {
        System.out.println("The course is in department: " + super.getDepartment() + "\nCourse Number: " + super.getCourseNumber() +
                "\nCredits: " + super.getCredits() + "\nTotal Fees (including Lab Fee): $" + super.getFees());
    }
}
