package week7.Coding.QUE8;

import java.util.Scanner;

public class UseCourse {
    public static void main(String[] args) {
        String department;
        int courseNumber;
        int credits;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Following details: ");
        System.out.println("Department Name: ");
        department = input.nextLine();
        System.out.println("Course number: ");
        courseNumber = input.nextInt();
        System.out.println("Credits: ");
        credits = input.nextInt();

        if (department.equals("BIO") || department.equals("CHM") || department.equals("CIS") || department.equals("PHY")) {
            LabCourse labCourse = new LabCourse(department, courseNumber, credits);
            labCourse.display();
        } else {
            CollegeCourse collegeCourse = new CollegeCourse(department, courseNumber, credits);
            collegeCourse.display();
        }
    }
}
