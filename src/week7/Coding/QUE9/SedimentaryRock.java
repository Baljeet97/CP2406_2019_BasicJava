package week7.Coding.QUE9;

public class SedimentaryRock extends Rock {
    SedimentaryRock(int numberOfSamples, int weightOfRock) {
        super(numberOfSamples, weightOfRock);
        super.description = "Sedimentary rocks are types of rock that are formed by the accumulation or deposition of " +
                "\nsmall particles and subsequent cementation of mineral or organic particles on the floor of oceans or " +
                "\nother bodies of water at the Earth's surface";
    }
}
