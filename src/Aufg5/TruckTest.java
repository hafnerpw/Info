package Aufg5;

public class TruckTest {
    public static void main(String[] args) {

        Truck trucker1 = new Truck();
        trucker1.setTruckId(1);
        trucker1.setBezeichnung("Frank");
        trucker1.setKennZeichen("AB-CD1235");
        trucker1.setLadeVolumen(15.5);

        Truck trucker2 = new Truck();
        trucker2.setTruckId(2);
        trucker2.setBezeichnung("Hans");
        trucker2.setKennZeichen("BA-DC4242");
        trucker2.setLadeVolumen(20.1);



        System.out.println("Das Ladevolumen des 1. LKWs beträgt: " + trucker1.getLadeVolumen()+ " t");

        Truck trucker3 = new Truck();
        trucker3.setTruckId(3);
        trucker3.setBezeichnung("Gandon");
        trucker3.setKennZeichen("BB-HT1235");
        trucker3.setLadeVolumen(18.3);

        Truck trucker4 = new Truck();
        trucker4.setTruckId(4);
        trucker4.setBezeichnung("Uebok");
        trucker4.setKennZeichen("AA-BF4242");
        trucker4.setLadeVolumen(22.7);









    }
}
