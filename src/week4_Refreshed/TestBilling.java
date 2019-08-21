package week4_Refreshed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestBilling {


    @Test
    void testComputeBill1() {

        Billing billing = new Billing();
        assertEquals(40.08, billing.computeBill(20));

    }

    @Test
    void ComputeBill2(){

        Billing billing = new Billing();
        assertEquals(120.08, billing.computeBill(20,5));

    }


    @Test
    void ComputeBill3(){

        Billing billing = new Billing();
        assertEquals(117.08, billing.computeBill(20,5, 3));

    }

}
