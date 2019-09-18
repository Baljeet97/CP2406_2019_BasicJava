package week8.Coding.QUE8;

public class UndergraduateStudent extends Student {
    UndergraduateStudent(int id, String lastName) {
        super(id, lastName);
        setTuition();
    }

    @Override
    public void setTuition() {
        this.tuition = 4000;
    }
}
