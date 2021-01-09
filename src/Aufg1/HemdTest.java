package Aufg1;

public class HemdTest {

    public static void main(String[] args) {

        Hemd gucciHemd = new Hemd();
            gucciHemd.setHemdId(512);
            gucciHemd.setBeschreibung("Gucci");
            gucciHemd.setFarbCode('b');
            gucciHemd.setPreis(800.00);
            gucciHemd.setMengeAufLager(50);

        System.out.println("Das Hemd ist von der Marke " + gucciHemd.getBeschreibung() + " in der Farbe " + gucciHemd.getFarbCode()
        + " und hat einen Preis von " + gucciHemd.getPreis() + " Euro.");

    }
}
