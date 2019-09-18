package week8.Coding.QUE2;

public class IncomingPhoneCall extends PhoneCall {
    IncomingPhoneCall(String phoneNumber) {
        super(phoneNumber);
        super.setPrice(0.02);
    }

    @Override
    String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    double getPrice() {
        return price;
    }

    @Override
    void getCallInfo() {
        System.out.println("Incoming Call\n" + "Phone number: " + getPhoneNumber() + " Rate: $" + getPrice() + " Price: $" + getPrice());
    }
}

