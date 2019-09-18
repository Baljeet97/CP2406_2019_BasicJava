package week8.Coding.QUE5;

abstract class Element {
    private String symbol;
    private int atomicNumber;
    private double atomicWeight;

    Element(String symbol, int atomicNumber, double atomicWeight) {
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    int getAtomicNumber() {
        return atomicNumber;
    }

    double getAtomicWeight() {
        return atomicWeight;
    }

    String getSymbol() {
        return symbol;
    }

    abstract void describeElement();
}
