package Aufg2;

public class OneDayTest {
    public static void main(String[] args) {

        OneDay geburtstag = new OneDay(24, 1996, "September");
        OneDay weihnachten = new OneDay(24, 2021, "Dezember");

        OneDay waltersBday = new OneDay();
        waltersBday.setTag(10);
        waltersBday.setMonat("Mai");
        waltersBday.setJahr(1997);
        System.out.println("Walters Bday ist am:" + waltersBday.getTag() + waltersBday.getMonat() + waltersBday.getJahr());


    }

}
