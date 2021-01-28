package Meilenstein3;




public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student("Albert", "Einstein", 29, "IBIS", new StudienBG("WiSe", 2021), 123456, 2.2);

        System.out.println(student1.displayInformation());

        System.out.println("ende des programms");

    }
}
