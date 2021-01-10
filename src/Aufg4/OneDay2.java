package Aufg4;

import java.util.Arrays;

public class OneDay2 {

    //Attribute
    private int tag;
    private int jahr;

    private String monat;

    private String[] monate = {"Jan","Feb","Mrz","Apr","Mai","Jun","Jul","Aug","Sep","Okt","Nov","Dez"};


    public OneDay2() {
        this(0,0, "");
    }

    public String[] getMonate() {
        return monate;
    }

    public void setMonate(String[] monate) {
        this.monate = monate;
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
    public OneDay2(int tag, int jahr, String monat) {
        this.tag = tag;
        this.jahr = jahr;
        this.monat = monat;
        if (!Arrays.asList(monate).contains(monat)) {
            System.out.println("fehler ");
            return;
        }
    }
    public void displayDate(){
        System.out.println("Das Datum lautet "+ this.tag + this.monat + this.jahr);
    }

}