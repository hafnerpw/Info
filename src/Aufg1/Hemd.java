package Aufg1;

public class Hemd {

    private int hemdId;
    private String beschreibung;
    private char farbCode;
    private double preis;
    private int mengeAufLager;


    public Hemd(int hemdId, String beschreibung, char farbCode, double preis, int mengeAufLager) {
        this.hemdId = hemdId;
        this.beschreibung = beschreibung;
        this.farbCode = farbCode;
        this.preis = preis;
        this.mengeAufLager = mengeAufLager;
    }

    void displayKunde() {
        System.out.println("ID: " + hemdId);
        System.out.println("Name: " + preis);
        System.out.println("E-Mail: " + mengeAufLager);
    }

    @Override
    public String toString() {
        String farbe = "";
        if (farbCode == 'b') {
            farbe = "blau";
        } else if (farbCode == 'r') {
            farbe = "rot";
        } else if (farbCode == 'g') {
            farbe = "gelb";
        }
        return "Hemd " + "\r\n" + "    id: " + hemdId + "\r\n" + "    beschreibung: " + beschreibung + "\r\n" +
                "    farbe: " + farbe + "\r\n" + "    preis: " + preis + "\r\n"
                + "    menge: " + mengeAufLager + "\r\n" + "}";
    }
}
