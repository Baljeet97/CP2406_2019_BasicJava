package week4_Refreshed;

/* How to use Java built in Functions for this, Rather than using String as Date?
import java.util.Date;
import java.util.Calendar;

 */

public class FitnessTracker {

    private String activity;
    private int minutesSpent;
    private String date;

    public FitnessTracker() {

        activity = "running";
        minutesSpent = 0;
        date = "01/01/2019";

    }

    public FitnessTracker(String activity, int minutesSpent, String date) {

        this.activity = activity;
        this.minutesSpent = minutesSpent;
        this.date = date;

    }


    public String getDate() {
        return date;
    }

    public int getMinutesSpent() {
        return minutesSpent;
    }

    public String getActivity() {
        return activity;
    }


}
