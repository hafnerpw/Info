package Aufg5;

public class Truck {

    //Klassenvariable deklarieren
    private static int anzahlTrucker;

    // max bestimmten
    public static int ladeVolumenMax;



    public static int getLadeVolumenMax() {
        return Truck.ladeVolumenMax;
    }




    //Klassenmethode deklarieren
    public static int getAnzahlTrucker() {
        return Truck.anzahlTrucker;
    }

    public void erhöheAnzahlTrucks(){
        ++Truck.anzahlTrucker;
    }

    //Attribute
    private int truckId;
    private String bezeichnung;
    private String kennZeichen;
    private double ladeVolumen;

    //Konstruktor
    public Truck(int truckId, String bezeichnung, String kennZeichen, double ladeVolumen) {
        this.truckId = truckId;
        this.bezeichnung = bezeichnung;
        this.kennZeichen = kennZeichen;
        this.ladeVolumen = ladeVolumen;
        ++anzahlTrucker;
        if (Truck.ladeVolumenMax > this.ladeVolumen) {

        }
        else {
            int ladeVolumenMax = (int) this.ladeVolumen;

        }
    }


    public int getTruckId() {
        return truckId;
    }

    public void setTruckId(int truckId) {
        this.truckId = truckId;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getKennZeichen() {
        return kennZeichen;
    }

    public void setKennZeichen(String kennZeichen) {
        this.kennZeichen = kennZeichen;
    }

    public double getLadeVolumen() {
        return ladeVolumen;
    }

    public void setLadeVolumen(double ladeVolumen) {
        this.ladeVolumen = ladeVolumen;
    }
}
