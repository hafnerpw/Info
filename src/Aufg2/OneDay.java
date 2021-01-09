package Aufg2;

public class OneDay {

    //Attribute
    private int tag;
    private int jahr;

    private String monat;

    public OneDay() {
        this(0,0, "");
    }

    //Getter und Setter
    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public String getMonat() {
        return monat;
    }

    public void setMonat(String monat) {
        this.monat = monat;
    }
        //Konstrukor
    public OneDay(int tag, int jahr, String monat) {
        this.tag = tag;
        this.jahr = jahr;
        this.monat = monat;
    }
}
