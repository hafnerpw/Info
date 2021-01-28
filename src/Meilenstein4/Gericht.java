package Meilenstein4;

import java.util.ArrayList;

public class Gericht {

    public Gericht(String name) {
        this.name = name;
    }

    private String name;
    private ArrayList<String> Zutaten = new ArrayList<String>();

    public void zubereitung() {
        if(this instanceof Pizza){
            System.out.println("Pizza " + this.name + "Pizzaboden, belegt mit:");
        }else if(this instanceof Burger){
            System.out.println(this.name + ". Brötchen mit:");
        }

        for (String s: this.Zutaten){
            System.out.println("- " + s);
        }
    }

    public void istBelegtMit(String zutat) {
        Zutaten.add(zutat);
    }
}
