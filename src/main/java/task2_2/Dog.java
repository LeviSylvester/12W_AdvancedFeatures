package task2_2;

/*1. Create class Dog.
 a) Add private fields to the class, like name, age, gender, race, weigth.
 b) Create constructor that accepts all of the class fields.
 c) Create additional constructor, that will accept only gender and race.
    It should call main constructor with default values.
 d) Create getters and setters for age and weigth.
 e) Create object of class Dog. Verify if everything works as expected.
 f) Add verification for all arguments passed to the setters.
    E.g. setWeigth method should not accept values below or equal to O.*/
public class Dog {
    private String name;
    private int age;
    private char gender;
    private String race;
    private short weight;

    public Dog(char gender, String race) {
        this.gender = gender;
        this.race = race;
    }

    public Dog(String name, int age, char gender, String race, short weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public static void printError(String field) {
        System.out.println("not a valid input for " + field);
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            printError("age");
        }
    }

    public short getWeight() {
        return weight;
    }

    public void setWeight(short weight) {
        if (weight >= 0) {
            this.age = age;
        } else {
            printError("weight");
        }
    }

    public static void main(String[] args) {
        Dog rex = new Dog('m', "bulldog");
    }
}
