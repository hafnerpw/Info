package Aufgb4;

import Aufg2.OneDay;

public class OneDayTest2 {
    public static void main(String[] args) {


        OneDay2 waltersBday = new OneDay2();
        waltersBday.setTag(10);
        waltersBday.setMonat("Mai");
        waltersBday.setJahr(1997);
        System.out.println("Walters Bday ist am: " + waltersBday.getTag()+"." +" "+ waltersBday.getMonat() +" "+ waltersBday.getJahr());

        waltersBday.displayDate();

    }


}
