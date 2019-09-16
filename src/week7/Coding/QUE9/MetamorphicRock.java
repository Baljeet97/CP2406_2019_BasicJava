package week7.Coding.QUE9;

public class MetamorphicRock extends Rock {
    MetamorphicRock(int numberOfSamples, int weightOfRock) {
        super(numberOfSamples, weightOfRock);
        super.description = "Metamorphic rocks were once igneous or sedimentary rocks, but have been changed " +
                "\n(metamorphosed) as a result of intense heat and/or pressure within the Earth's crust.";
    }
}
