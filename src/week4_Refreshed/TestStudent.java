package week4_Refreshed;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestStudent {

    @Test
    public void basicTest() {
        Student student = new Student();

        student.setId(52);
        assertEquals(52, student.getId());

        student.setCreditHoursEarned(12.00);
        assertEquals(12.00, student.getCreditHoursEarned(),0);

        student.setPointsEarned(5.2);
        assertEquals(5.2, student.getPointsEarned(),0);


    }
}
