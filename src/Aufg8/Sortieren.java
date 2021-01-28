package Aufg8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Sortieren {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> liste = new ArrayList<Integer>();

        System.out.print("Geben Sie ihre eine beliebige Zahlenfolge ein! ");


        while (scan.hasNextInt() && liste.size() < 5) {
            liste.add(scan.nextInt());


        }
        System.out.println("Vor der Sortierung \n" + liste);


        Collections.sort(liste);
        System.out.println("Nach der Sortierung \n" + liste);


        System.out.println("Aufsteigend sortiert!");
        liste.sort(Collections.reverseOrder());
        System.out.println(liste);


        scan.close();
        int e = 1;
        for (int i : liste) {

            System.out.println("Ausgabe der Liste " + liste + "Anzahl " + e++);

        }
    }

}
