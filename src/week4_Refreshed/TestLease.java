package week4_Refreshed;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestLease {

    @Test
    void leaseTest(){
        Lease lease = new Lease("B",7,400.50f,5);

    }


    @Test
    void addPetFee(){
        Lease lease = new Lease("B",7,400.50f,5);
        lease.addPetFee();
        assertEquals(410.5f,lease.getMonthlyRent());

    }

}
