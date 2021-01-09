package Aufg3;

public class KundeTest {

    public static void main(String[] args) {
        Kunde k1= new Kunde(1, "Fred", "fred@fred.at");
        Kunde k2= new Kunde(1, "Fred", "fred@fred.at");
        System.out.println(k1.equals(k2));
        System.out.println(k1.isEqual(k2));
        System.out.println(areTheseTwoEqual(k1, k2));
    }

    public static boolean areTheseTwoEqual(Kunde a, Kunde b){
        return a.mailAdr.equals(b.mailAdr);
    }
}
