package week7.Coding.QUE3;

public class PetSold {
    private boolean vaccinated;
    private boolean neutered;
    private boolean houseBroken;

    public void setHouseBroken(boolean houseBroken) {
        this.houseBroken = houseBroken;
    }

    public void setNeutered(boolean neutered) {
        this.neutered = neutered;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public boolean getHouseBroken() {
        return houseBroken;
    }

    public boolean getNeutered() {
        return neutered;
    }

    public boolean getVaccinated() {
        return vaccinated;

    }
}
