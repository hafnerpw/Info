package AufgFahrzeug;

import java.util.ArrayList;

public class DatenstrukturMain {

    public static void main(String[] args) {
        Fahrzeug audi1 = new Fahrzeug("audi");
        Fahrzeug toyota = new Fahrzeug("f2");
        Fahrzeug peugeauoite = new Fahrzeug("f3");

        ArrayList<Testfahrt> testfahrten = new ArrayList<>();
        testfahrten.add(new Testfahrt(audi1));
        testfahrten.get(0).addFahrzeit(10.3);
        testfahrten.add(new Testfahrt(toyota));
        testfahrten.get(1).addFahrzeit(4.6);
        testfahrten.add(new Testfahrt(peugeauoite));
        testfahrten.get(2).addFahrzeit(7.2);
        testfahrten.add(new Testfahrt(new Fahrzeug("Nissan")));
        testfahrten.get(3).addFahrzeit(17.1);

        for (Testfahrt fahrt: testfahrten) {
            System.out.println(fahrt.fahrzeug.name);
            for (double zeit: fahrt.fahrtzeiten) {
                System.out.println(zeit + "s");
            }
        }
    }
}

