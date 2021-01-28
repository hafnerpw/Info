package AufgFahrzeug;

import java.util.ArrayList;
import java.util.HashMap;

public class DatenstrukturMain {
    public static void main(String[] args) {

        HashMap<Fahrzeug, ArrayList<Testfahrt>> datenliste = new HashMap<>();
        datenliste.put(new Fahrzeug("Audi"), new ArrayList<>());
        datenliste.put(new Fahrzeug("Tesla"), new ArrayList<>());
        datenliste.put(new Fahrzeug("Benz"), new ArrayList<>());

    }




}

