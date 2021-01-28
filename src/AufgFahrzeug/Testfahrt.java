package AufgFahrzeug;

import java.util.ArrayList;

public class Testfahrt {


    public ArrayList<Double> fahrtzeiten = new ArrayList<>();
    public Fahrzeug fahrzeug;

    public Testfahrt(Fahrzeug fahrzeug) {
        this.fahrzeug = fahrzeug;
    }

    public void addFahrzeit(double d){
        fahrtzeiten.add(d);
    }
}
