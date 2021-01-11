package MS3;

public class StudienBeginn {
    private final String semester;
    private final int jahr;

    public StudienBeginn(String semester, int jahr) {
        this.semester = semester;
        this.jahr = jahr;
    }

    @Override
    public String toString() {
        return semester + jahr;
    }
}
