package week4_Refreshed;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


class TestStudent {

    @Test
    void basicTest() {
        Student student = new Student();

        student.setId(52);
        assertEquals(52, student.getId());

        student.setCreditHoursEarned(12.00);
        assertEquals(12.00, student.getCreditHoursEarned(), 0);

        student.setPointsEarned(5.2);
        assertEquals(5.2, student.getPointsEarned(), 0);


    }


    @Test
    void checkGPA(){
        Student student = new Student();
        student.setPointsEarned(10);
        student.setCreditHoursEarned(2);
        assertEquals(10/2, student.gpa(),0); // didn't understand the "delta"


    }




    @Test
    void initializer(){
        Student student = new Student();
        assertEquals(student.getId(), 9999);
        assertEquals(student.getPointsEarned(), 12,0);
        assertEquals(student.getCreditHoursEarned(), 3,0);
        assertEquals(student.gpa(), 4.0,0);
    }
}

