package week8.Coding.QUE5;

public class ElementArray {
    public static void main(String[] args) {
        Element[] elements = {
                new MetalElement("Li", 3, 6.941),
                new NonMetalElement("H", 1, 1.008),
                new MetalElement("Ca", 20, 40.078),
                new NonMetalElement("C", 6, 12.011)
        };

        for (Element element : elements) {
            element.describeElement();
        }
    }
}

