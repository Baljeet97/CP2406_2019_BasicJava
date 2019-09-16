package week7.Coding.QUE9;

public class DemoRocks {
    public static void main(String[] args) {
        IgneousRock igneous = new IgneousRock(5, 30);
        SedimentaryRock sedimentary = new SedimentaryRock(8, 36);
        MetamorphicRock metamorphic = new MetamorphicRock(17, 37);

        System.out.println("---Rocks History---");
        System.out.println("\nIgneous Rock" + "\nNumber of Samples: " + igneous.getNumberOfSamples() + "\nWeight Of Rock: "
                + igneous.getWeightOfRock() + "\nDescription: " + igneous.getDescription());
        System.out.println("\nSedimentary Rock" + "\nNumber of Samples: " + sedimentary.getNumberOfSamples() + "\nWeight Of Rock: "
                + sedimentary.getWeightOfRock() + "\nDescription: " + sedimentary.getDescription());
        System.out.println("\nMetamorphic Rock" + "\nNumber of Samples: " + metamorphic.getNumberOfSamples() + "\nWeight Of Rock: "
                + metamorphic.getWeightOfRock() + "\nDescription: " + metamorphic.getDescription());
    }
}
