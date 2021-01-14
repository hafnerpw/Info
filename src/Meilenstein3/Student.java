package Meilenstein3;

import java.util.Date;

public class Student extends Person {

    private String Studiengang;
    private Date Studienbeginn;
    private int Matrikelnummer;
    private int Abinote;

    public Student(String name, String vorname, int alter, String studiengang, Date studienbeginn, int matrikelnummer, int abiNote) {
        super(name, vorname, alter);
        this.Studiengang = studiengang;
        this.Studienbeginn = studienbeginn;
        Matrikelnummer = matrikelnummer;
        this.Abinote = abiNote;
    }
}
