package Aufg3;

public class Kunde {
    int id;
    String name;
    String mailAdr;

    public Kunde(int id, String name, String mailAdr) {
        this.id = id;
        this.name = name;
        this.mailAdr = mailAdr;
    }

    void displayKunde(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("E-Mail: " + mailAdr);
    }
}
