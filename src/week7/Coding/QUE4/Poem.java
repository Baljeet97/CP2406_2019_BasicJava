package week7.Coding.QUE4;

public class Poem {
    private String name;
    private int lines;

    Poem(String name, int lines) {
        this.name = name;
        this.lines = lines;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    public String getName() {
        return name;
    }

    public int getLines() {
        return lines;
    }
}
