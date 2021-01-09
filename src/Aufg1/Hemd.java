package Aufg1;

public class Hemd {

    private int hemdId;
    private String beschreibung;
    private char farbCode;
    private double preis;
    private int mengeAufLager;



    public void setHemdId(int hemdId) {
        this.hemdId = hemdId;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public char getFarbCode() {
        return farbCode;
    }

    public void setFarbCode(char farbCode) {
        this.farbCode = farbCode;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getMengeAufLager() {
        return mengeAufLager;
    }

    public void setMengeAufLager(int mengeAufLager) {
        this.mengeAufLager = mengeAufLager;
    }
}
