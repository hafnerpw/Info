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

    public String getStudiengang() {
        return Studiengang;
    }

    public void setStudiengang(String studiengang) {
        Studiengang = studiengang;
    }

    public Date getStudienbeginn() {
        return Studienbeginn;
    }

    public void setStudienbeginn(Date studienbeginn) {
        Studienbeginn = studienbeginn;
    }

    public int getMatrikelnummer() {
        return Matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        Matrikelnummer = matrikelnummer;
    }

    public int getAbinote() {
        return Abinote;
    }

    public void setAbinote(int abinote) {
        Abinote = abinote;
    }
}
