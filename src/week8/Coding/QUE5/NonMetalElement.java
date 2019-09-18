package week8.Coding.QUE5;

class NonMetalElement extends Element {
    NonMetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    void describeElement() {
        System.out.println("\nNon-Metal Element\n" + "Symbol: " + getSymbol() + "\nAtomic Number: " + getAtomicNumber() +
                "\nAtomic Weight: " + getAtomicWeight() + "\nDescription: Non-Metals are poor conductors.\n");
    }
}
