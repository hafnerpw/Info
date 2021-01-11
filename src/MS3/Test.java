package MS3;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Person> personen = new LinkedList<Person>();
        //LinkedList benutzt weil es im Beispiel sehr danach ausgesehen hat. Vielleicht hattet ihr das aber noch nicht
        //Ein einfaches Array geht genauso
        personen.add(new Student("Albert", "Einstein", 29, 2.2, "IBIS", new StudienBeginn("WiSe", 2021)));
        personen.add(new Person("Rainer", "Zufall", 45));
        personen.add(new Student("Nikolaus", "Kopernikus", 27, 2.3, "IBIS", new StudienBeginn("SoSe", 20)));
        personen.add(new Student("Rosalind", "Franklin", 22, 2.1, "EBIS", new StudienBeginn("SoSe", 20)));

        display(personen);
        System.out.println("Das Durchschnittsalter der Student*innen beträgt: " + averageAlter(personen));
    }


    static void display(LinkedList<Person> liste) {
        for (Person p : liste) {
            System.out.println(p);
        }
    }

    static double averageAlter(LinkedList<Person> liste) {
        int anzahl = 0;
        double alterGesamt = 0;
        for (Person p : liste) {
            if (p instanceof Student) {
                anzahl++;
                alterGesamt += p.getAlter();
            }
        }
        return alterGesamt / anzahl;

    }
}
