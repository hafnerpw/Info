package Aufg1;

public class HemdTest {

    public static void main(String[] args) {

        Hemd gucciHemd = new Hemd(1, "Gucci Hemd", 'b', 800, 50);
        Hemd hugoBoss = new Hemd(2, "Hugo Boss", 'r',200, 12);
        Hemd tommyHilf = new Hemd(3, "Tommy Hilfiger", 'g', 350, 55);
        Hemd adidas = new Hemd(6, "Adidas Hemd", 'b', 65, 100);


        displayInformation(gucciHemd);
        displayInformation(hugoBoss);
        displayInformation(tommyHilf);
        displayInformation(adidas);

    }

    private static void displayInformation(Hemd kannHeissenWieduWillstUndHatNICHTSmitDenVariablenZuvorZuTun) {
        System.out.println(kannHeissenWieduWillstUndHatNICHTSmitDenVariablenZuvorZuTun);
    }

}
