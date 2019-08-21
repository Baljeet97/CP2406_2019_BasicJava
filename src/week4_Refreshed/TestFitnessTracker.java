package week4_Refreshed;


/* Can you Please Comment About my testing, because I am not sure if I'm doing it right*/


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestFitnessTracker {


    @Test
    void checkFitnessTracker() {
        FitnessTracker fitnessTracker = new FitnessTracker();
        assertEquals("running", fitnessTracker.getActivity());

        assertEquals(0, fitnessTracker.getMinutesSpent());

        assertEquals("01/01/2019", fitnessTracker.getDate());

    }


    @Test
    void TestFitnessTracker() {
        FitnessTracker fitnessTracker = new FitnessTracker("running", 0, "01/01/2019");


    }
}
