package week8.Coding.QUE8;

public class StudentAtLarge extends Student {
    StudentAtLarge(int id, String lastName) {
        super(id, lastName);
        setTuition();
    }

    @Override
    public void setTuition() {
        this.tuition = 2000;
    }
}
