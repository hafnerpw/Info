package Meilenstein3;

import java.util.Date;

public class Student extends Person {

    private String Studiengang;
    private StudienBG Studienbeginn;
    private int Matrikelnummer;
    private double Abinote;

    public Student(String name, String vorname, int alter, String studiengang, StudienBG studienbeginn, int matrikelnummer, double abiNote) {
        super(name, vorname, alter);
        this.Studiengang = studiengang;
        this.Studienbeginn = studienbeginn;
        Matrikelnummer = matrikelnummer;
        this.Abinote = abiNote;
    }
    public String displayInformation() {
        String str = "";
        str += this.getVorname() + " " + this.getName() + "\n" + this.getAlter() + " Jahre alt" + "\n" + "Abinote " +
        this.getAbinote() + "\n" + "MatrikelNr: " + this.getMatrikelnummer() + "\n" + this.Studienbeginn.getSemester() + this.Studienbeginn.getSemesterJahr();
        return str;
    }

    public String getStudiengang() {
        return Studiengang;
    }

    public void setStudiengang(String studiengang) {
        Studiengang = studiengang;
    }

    public StudienBG getStudienbeginn() {
        return Studienbeginn;
    }

    public void setStudienbeginn(StudienBG studienbeginn) {
        Studienbeginn = studienbeginn;
    }

    public int getMatrikelnummer() {
        return Matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        Matrikelnummer = matrikelnummer;
    }

    public double getAbinote() {
        return Abinote;
    }

    public void setAbinote(double abinote) {
        Abinote = abinote;
    }
}
