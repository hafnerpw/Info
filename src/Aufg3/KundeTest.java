package Aufg3;

public class KundeTest {

    public static void main(String[] args) {
        Kunde k1 = new Kunde(1, "Fred", "fred@fred.at");
        Kunde k2 = new Kunde(1, "Fred", "fred@fred.at");

        System.out.println(k1.equals(k2));
        System.out.println(k1.isEqual(k2));


        isEquals(k1, k2);
    }


    public static boolean isEquals(Kunde kunde1, Kunde kunde2) {

        return kunde1.mailAdr.equals(kunde2.mailAdr);
    }
}










