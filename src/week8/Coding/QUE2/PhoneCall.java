package week8.Coding.QUE2;

abstract class PhoneCall {
    String phoneNumber;
    double price;

    PhoneCall(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        price = 0.0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract String getPhoneNumber();
    abstract double getPrice();
    abstract void getCallInfo();
}
