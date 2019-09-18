package week8.Coding.QUE3;

public class OnlineNewspaperSubscription extends NewspaperSubscription {

    OnlineNewspaperSubscription(String address, String name) {
        super(address, name);
        setAddress();
    }

    @Override
    public void setAddress() {
        if (getAddress().contains("@")) {
            rate = 9;
        } else {
            rate = 0;
        }
    }
}
