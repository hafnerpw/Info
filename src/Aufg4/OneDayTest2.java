package Aufg4;

public class OneDayTest2 {
    public static void main(String[] args) {


        OneDay2 waltersBday = new OneDay2();
        waltersBday.setTag(10);
        waltersBday.setMonat("Mai");
        waltersBday.setJahr(1997);
        System.out.println("Walters Bday ist am: " + waltersBday.getTag()+"." +" "+ waltersBday.getMonat() +" "+ waltersBday.getJahr());

        OneDay2 yarrakTag = new OneDay2(1,2000,"Januar");

        waltersBday.displayDate();

    }


}
