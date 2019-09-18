package week8.Coding.QUE8;

public class StudentDemo {
    public static void main(String[] args) {
        Student[] tuitionType = {
                new UndergraduateStudent(8621, "Dennis"),
                new GraduateStudent(5463, "Sexton"),
                new StudentAtLarge(1789, "Grimes"),
                new UndergraduateStudent(8623, "Patrick"),
                new GraduateStudent(5496, "Olsen"),
                new StudentAtLarge(1785, "Daniels")
        };

        for (Student fees : tuitionType) {
            System.out.println("Student id: " + fees.getId() + "\nLast Name: " + fees.getLastName() + "\nFees: $"
                    + fees.tuition + "\n");
        }
    }
}
