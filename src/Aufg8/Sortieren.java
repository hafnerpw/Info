package Aufg8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sortieren {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> liste = new ArrayList<Integer>();

        System.out.print("Geben Sie ihre eine beliebige Zahlenfolge ein! ");


        while (scan.hasNextInt() && liste.size() < 5) {
            liste.add(scan.nextInt());


        }
        System.out.println("Vor der Sortierung");
        System.out.println(liste);

        Collections.sort(liste);
        System.out.println("Nach der Sortierung");
        System.out.println(liste);

    }

}
