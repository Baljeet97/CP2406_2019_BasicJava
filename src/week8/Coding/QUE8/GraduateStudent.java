package week8.Coding.QUE8;

public class GraduateStudent extends Student {
    GraduateStudent(int id, String lastName) {
        super(id, lastName);
        setTuition();
    }

    @Override
    public void setTuition() {
        this.tuition = 6000;
    }
}
