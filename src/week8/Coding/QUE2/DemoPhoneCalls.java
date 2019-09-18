package week8.Coding.QUE2;

public class DemoPhoneCalls {
    public static void main(String[] args) {
        IncomingPhoneCall incomingPhoneCall = new IncomingPhoneCall("4050605080");
        OutgoingPhoneCall outgoingPhoneCall = new OutgoingPhoneCall("4020309080", 20);

        incomingPhoneCall.getCallInfo();
        outgoingPhoneCall.getCallInfo();
    }
}
