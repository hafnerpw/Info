package Meilenstein4;

import java.util.ArrayList;

public class Gericht {

    private String name;
    private ArrayList<String> Zutaten = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getZutaten() {
        return Zutaten;
    }

    public void setZutaten(ArrayList<String> zutaten) {
        Zutaten = zutaten;
    }
    /*
    public void zubereitung() {
        String s = this.name;
        for (String e : Zutaten) {

        } */
}




}
