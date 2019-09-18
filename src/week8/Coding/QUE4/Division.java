package week8.Coding.QUE4;

abstract class Division {
    String divisionName;
    int accountNumber;

    Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public abstract void display();
}
