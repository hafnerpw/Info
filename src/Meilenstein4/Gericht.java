package Meilenstein4;

import java.util.ArrayList;

public class Gericht {

    private String name;
    private ArrayList<String> Zutaten = new ArrayList<String>();

    public void IstBelegtMit(String s) {

        Zutaten.add(s);
    }

    public void zubereitung() {
        String s = this.name;
        if (this instanceof Pizza) {
            for (String e : Zutaten) {
                s += "- " + e "\n";
            }
        } else if (this instanceof Burger) {
            for (String e : Zutaten) {
                s += "- " + e "\n";
            }
        }






    /*
    public void zubereitung() {
        String s = this.name;
        for (String e : Zutaten) {

        } */
    }




}
