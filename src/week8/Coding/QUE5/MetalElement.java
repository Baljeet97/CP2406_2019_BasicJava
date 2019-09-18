package week8.Coding.QUE5;

class MetalElement extends Element {
    MetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    void describeElement() {
        System.out.println("Metal Element\n" + "Symbol: " + getSymbol() + "\nAtomic Number: " + getAtomicNumber() +
                "\nAtomic Weight: " + getAtomicWeight() + "\nDescription: Metals are good conductor of electricity.");
    }
}
