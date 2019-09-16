package week7.Coding.QUE9;

public class Rock {
    private int numberOfSamples;
    String description;
    private int weightOfRock;

    Rock(int numberOfSamples, int weightOfRock){
        this.numberOfSamples = numberOfSamples;
        this.weightOfRock = weightOfRock;
        description = "Unclassified";
    }

    String getDescription() {
        return description;
    }

    public int getWeightOfRock() {
        return weightOfRock;
    }

    public int getNumberOfSamples() {
        return numberOfSamples;
    }
}
