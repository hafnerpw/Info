package Meilenstein3;

public class Person {


    private String Name;
    private String Vorname;
    private int Alter;

    public Person(String name, String vorname, int alter) {
        super();
        Name = name;
        Vorname = vorname;
        Alter = alter;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public int getAlter() {
        return Alter;
    }

    public void setAlter(int alter) {
        Alter = alter;
    }
}

