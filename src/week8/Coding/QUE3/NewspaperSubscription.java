package week8.Coding.QUE3;

abstract class NewspaperSubscription {
    String name, address;
    int rate;

    NewspaperSubscription(String address, String name) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    String getAddress() {
        return address;
    }

    public abstract void setAddress();
}
