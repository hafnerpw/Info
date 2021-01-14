package Meilenstein3;

import java.util.Date;

public class Student extends Person {

    private String Studiengang;
    private StudienBG Studiumbeginn;
    private int Matrikelnummer;
    private double Abinote;

    public Student(String name, String vorname, int alter, String studiengang, StudienBG studienbeginn, int matrikelnummer, double abiNote) {
        super(name, vorname, alter);
        this.Studiengang = studiengang;
        this.Studiumbeginn = studienbeginn;
        Matrikelnummer = matrikelnummer;
        this.Abinote = abiNote;
    }
    public String displayInformation() {
        String str = "";
        str += this.getVorname() + " " + this.getName() + "\n" + this.getAlter() + " Jahre alt" + "\n" + "Abinote " +
        this.getAbinote() + "\n" + "MatrikelNr: " + this.getMatrikelnummer() + "\n" + this.Studiumbeginn.getSemester() + this.Studiumbeginn.getSemesterJahr();
        return str;
    }

    public String getStudiengang() {
        return Studiengang;
    }

    public void setStudiengang(String studiengang) {
        Studiengang = studiengang;
    }

    public StudienBG getStudienbeginn() {
        return Studiumbeginn;
    }

    public void setStudienbeginn(StudienBG studienbeginn) {
        Studiumbeginn = studienbeginn;
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
