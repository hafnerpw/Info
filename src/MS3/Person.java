package MS3;

public class Person {
    private final String name;
    private final String vorname;
    private final int alter;

    public Person(String vorname, String name, int alter) {
        this.vorname = vorname;
        this.name = name;
        this.alter = alter;
    }

    @Override
    public String toString() {
        if(!(this instanceof Student)){
            return "Person [Name=" + name + ", Vorname=" + vorname + ", Alter=" +
                    alter + "]\r\n"+ "\r\n" +
                    "--------------------------------";
        }
        return name + " " + vorname + "\r\n"+
                alter + " Jahre alt";
    }

    public int getAlter() {
        return alter;
    }
}
