package week8.Coding.QUE3;

public class DemoSubscriptions {
    public static void main(String[] args) {
        PhysicalNewspaperSubscription physical = new PhysicalNewspaperSubscription("2scott st", "dan");
        PhysicalNewspaperSubscription physical1 = new PhysicalNewspaperSubscription("scott st", "dan");
        OnlineNewspaperSubscription online = new OnlineNewspaperSubscription("2@gmail.com", "dun");
        OnlineNewspaperSubscription online1 = new OnlineNewspaperSubscription("2mail.com", "dun");

        if (physical1.getRate() == 0 || online1.getRate() == 0) {
            System.out.println("Invalid Address: " + physical1.getAddress());
            System.out.println("Invalid Address: " + online1.getAddress());
        }

        if (online.getRate() != 0 || physical.getRate() == 0) {
            System.out.println("\nPhysical Subscription: \n" + "Name: " + physical.getName() + "\nAddress: " + physical.getAddress() + "\nPrice: " + physical.getRate());
            System.out.println("\nOnline Subscription: \n" + "Name: " + online.getName() + "\nAddress: " + online.getAddress() + "\nPrice: " + online.getRate());
        }
    }
}
