package AufgFahrzeug;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DatenstrukturMain {
    public static void main(String[] args) {

        HashMap<Fahrzeug, ArrayList<Testfahrt>> datenliste = new HashMap<>();
        datenliste.put(new Fahrzeug("Audi"), new ArrayList<>());
        datenliste.put(new Fahrzeug("Tesla"), new ArrayList<>());
        datenliste.put(new Fahrzeug("Benz"), new ArrayList<>());

        for(Map.Entry<Fahrzeug, ArrayList<Testfahrt>> entry: datenliste.entrySet()){
            entry.getValue().add(new Testfahrt(13.0));
        }

        // konsolen ausgabe
        for(Map.Entry<Fahrzeug, ArrayList<Testfahrt>> entry: datenliste.entrySet()){
            System.out.println("key: " +entry.getKey().name + " value: "+  entry.getValue().get(0).getFahrzeit());

        }

    }
}

