package week8.Coding.QUE8;

abstract class Student {
    private int id;
    private String lastName;
    int tuition;

    Student(int id, String lastName) {
        this.id = id;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public abstract void setTuition();
}
