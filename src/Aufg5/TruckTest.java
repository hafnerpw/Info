package Aufg5;

public class TruckTest {
    public static void main(String[] args) {

        //random trucker
        Truck trucker1 = new Truck(1, "Frank", "AB-CD12345", 15.5);
        Truck trucker2 = new Truck(2, "Hans", "BA-DC4242", 20.1);

        //test sout
        System.out.println("Das Ladevolumen des 1. LKWs beträgt: " + trucker1.getLadeVolumen() + " t");

        //aufgabe trucker
        Truck trucker3 = new Truck(3, "Gandon", "BB-HT1242", 18.3);
        Truck trucker4 = new Truck(4, "Uebok", "AA-BF3242", 22.7);

        System.out.println("Anzahl der Trucks: " + Truck.getAnzahlTrucker());



    }
}
