package week4_Refreshed;

public class Lease {
    private String tenantsName;
    private int roomNumber;
    private float monthlyRent;
    private int term;

    public Lease(String tenantsName, int roomNumber, float monthlyRent, int term) {
        setMonthlyRent(monthlyRent);
        setRoomNumber(roomNumber);
        setTenantsName(tenantsName);
        setTerm(term);
    }


    public float getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(float monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public String getTenantsName() {
        return tenantsName;
    }

    public void setTenantsName(String tenantsName) {
        this.tenantsName = tenantsName;
    }

    public void addPetFee() {
        monthlyRent += 10;

    }

    public static void explainPetPolicy() {
        System.out.println("Pet policy.");

    }

}
