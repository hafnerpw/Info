package Meilenstein4;

public class Restaurant {

    public static void main(String[] args) {
        Pizza funghi = new Pizza("Funghi");

        funghi.istBelegtMit("Mozzarella");
        funghi.istBelegtMit("Pilze");
        Pizza hawaii = new Pizza("Hawaii");
        hawaii.istBelegtMit("Mozzarella");
        hawaii.istBelegtMit("Schinken");
        hawaii.istBelegtMit("Ananas");
        Burger hamburger = new Burger("Hamburger");
        hamburger.istBelegtMit("Hackfleisch");
        hamburger.istBelegtMit("Ketchup");
        hamburger.istBelegtMit("Senf");

        Burger cheeseburger = new Burger("Cheeseburger");
        cheeseburger.istBelegtMit("Hackfleisch");
        cheeseburger.istBelegtMit("Käse");
        cheeseburger.istBelegtMit("Ketchup");
        cheeseburger.istBelegtMit("Senf");
        cheeseburger.istBelegtMit("Zwiebel");
        cheeseburger.istBelegtMit("Gurke");
        Gericht[] speisekarte = new Gericht[]{funghi,
                hawaii, hamburger, cheeseburger};
        for (
                Gericht gericht : speisekarte) {
            gericht.zubereitung();
        }
    }
}
