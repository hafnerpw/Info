package Block2a;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class IntStreamTest {

    public static void main(String[] args) {
        test1();
        test2();
    }

    /**
     * Erstellen Sie eine Klasse IntStreamTest mit einer test1() Methode. Generieren Sie in dieser mit
     * Hilfe der range Methode einen IntStream der Zahlen von 1 bis 100. Verwenden Sie
     * Transformatoren, um zunächst die ungeraden Zahlen aus dem Stream zu entfernen und
     * anschließend die übrig gebliebenden geraden Zahlen um 10 zu vervielfachen. Geben Sie das
     * Ergebnis durch einen Terminaloperator auf der Konsole aus.
     */
    public static void test1(){
        // Methoden: range(), filter(). Und forEach zum ausgeben.

        // Creating an IntStream
        IntStream stream = IntStream.range(1, 101).filter(stream -> stream % 2 == 0).map(stream -> stream * 10);


        geradeZahlen.forEach(zahlenliste -> System.out.println(zahlenliste * 10));

    }

    /**
     * Erstellen Sie außerdem in der Klasse IntStreamTest eine test2() Methode. Erstellen Sie darin eine
     * Integer-Liste der Größe 100 und fügen Sie mit Hilfe der Random Klasse zufällige Zahlen im Bereich
     * von 1 bis 1000 ein. Generieren Sie einen Stream und verwenden Sie Transformatoren um Zahlen,
     * die durch 5 teilbar aus dem Stream zu entfernen und das Ergebnis anschließend zu sortieren.
     * Speichern Sie die sortierte Liste mit Hilfe von collect in einer weiteren Liste ab. Geben Sie diese
     * auf der Konsole aus.
     */
    public static void test2(){
        // Methoden: Random().ints, filter, sorted und collect(Collectors.toList()
    }
}
