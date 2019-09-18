package week8.Coding.QUE3;

public class PhysicalNewspaperSubscription extends NewspaperSubscription {

    PhysicalNewspaperSubscription(String address, String name) {
        super(address, name);
        setAddress();
    }

    @Override
    public void setAddress() {
        if (getAddress().matches(".*\\d.*")) {
            rate = 15;
        } else {
            rate = 0;
        }
    }
}
