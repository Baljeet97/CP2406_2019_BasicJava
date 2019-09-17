package week8.Debugging;

public abstract class DebugBoat {
    private String boatType;
    int passengers;
    String power = "";

    DebugBoat(String bt) {
        boatType = bt;
    }

    public boolean equals(DebugBoat otherBoat) {
        boolean result;
        if ((passengers == otherBoat.passengers) && (power.equals(otherBoat.power)))
            result = true;
        else
            result = false;
        return result;
    }

    public String toString() {
        return ("This " + boatType + "boat carries " + passengers + " passengers" +
                " and is powered by " + power);
    }

    public abstract void setPower();

    public abstract void setPassengers();
}