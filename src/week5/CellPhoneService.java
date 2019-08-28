package week5;

import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tell us your usage: ");

        System.out.println("Talk minutes used");
        int minutes = scanner.nextInt();

        System.out.println("Text message sent: ");
        int messages = scanner.nextInt();

        System.out.println("Gigabytes used: ");
        int data = scanner.nextInt();

        String recommendation = "Our Recommendation";

        if (minutes < 500) {
            if (messages == 0 && data == 0)
                recommendation += "Plan A : $49 per month";
            else
                recommendation += "Plan B : $55 per month";
        } else {
            if (messages <= 100 && data == 0)
                recommendation += "Plan C : $61 per month";
            else if (messages > 100 && data == 0)
                recommendation += "Plan D : $70 per month";
            else if (messages <= 100 && data <= 2)
                recommendation += "Plan E : $79 per month";
            else
                recommendation += "Plan F : $87 per month";
        }

        System.out.println(recommendation);


    }


}
