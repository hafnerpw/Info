package MS3;

public class Student extends Person{
    private static int count = 0;
    private int matrikelnummer = 1234566;
    private final double note;
    private final String studiengang;
    private final StudienBeginn studienBeginn;

    public Student(String name, String vorname, int alter, double note, String studiengang, StudienBeginn studienBeginn) {
        super(name, vorname, alter);
        this.note = note;
        this.studiengang = studiengang;
        this.studienBeginn = studienBeginn;
        ++count;
        this.matrikelnummer += count;
    }

    @Override
    public String toString() {
        return super.toString() + "\r\n" + "Durchschnittsnote: " + note + "\r\n" +
                "MatrikelNr: " + matrikelnummer + "\r\n" +
                studiengang + " " + studienBeginn + "\r\n" + "\r\n" +
                "-------------------------------------"; //separator damits aussieht wie im Beispiel
    }

}
