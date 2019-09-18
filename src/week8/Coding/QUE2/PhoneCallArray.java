package week8.Coding.QUE2;

public class PhoneCallArray {
    public static void main(String[] args) {
        PhoneCall[] callData = {
                new IncomingPhoneCall("8040506050"),
                new OutgoingPhoneCall("8060907050", 20),
                new IncomingPhoneCall("8040506050"),
                new OutgoingPhoneCall("8060907050", 25),
                new IncomingPhoneCall("8040506050"),
                new OutgoingPhoneCall("8060907050", 10),
                new IncomingPhoneCall("8040506050"),
                new OutgoingPhoneCall("8060907050", 50),
                new IncomingPhoneCall("8060907050"),
                new OutgoingPhoneCall("8060907050", 30)
        };
        System.out.println("Phone History: ");
        for (PhoneCall calls : callData) {
            calls.getCallInfo();
        }
    }
}
