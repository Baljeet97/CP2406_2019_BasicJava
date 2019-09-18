package week8.Coding.QUE2;

import java.text.NumberFormat;

public class OutgoingPhoneCall extends PhoneCall {
    private float time;

    OutgoingPhoneCall(String phoneNumber, float time) {
        super(phoneNumber);
        super.setPrice(0.04);
        this.time = time;
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
        System.out.println("Outgoing Call\n" + "Phone number: " + getPhoneNumber() + " Rate: $" + getPrice() + " Number of Minutes: " + time + " Price: "
                + NumberFormat.getCurrencyInstance().format(this.price * this.time));
    }
}
