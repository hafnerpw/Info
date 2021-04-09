package Block2a;


import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class Human {
    private final int age;
    private final int cocklength;
    private final String name;
    private final String lastname;
    private final Sex gender;

    public Human(int age, int cocklength, String name, String lastname, Sex gender) {
        this.age = age;
        this.cocklength = cocklength;
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
    }

    public Human() {
       this(rnd(90), rnd(34), rndStr(8), rndStr(11),
                Sex.values()[new Random().nextInt(Sex.values().length)]);
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", cocklength=" + cocklength +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender=" + gender +
                '}';
    }

    public int getAge() {
        return age;
    }

    public int getCocklength() {
        return cocklength;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Sex getGender() {
        return gender;
    }

    enum Sex {MALE, FEMALE, OTHER, HUENBOCK}

    /**
     * @param length Anzahl der Elemente im Stream
     * @return Stream of Humans
     */
    public static Stream<Human> generateList(int length) {
        ArrayList<Human> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(new Human());
        }
        return list.stream();
    }

    private static int rnd(int max) {
        return new Random().nextInt(max - 1);
    }

    private static String rndStr(int max) {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(max)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
