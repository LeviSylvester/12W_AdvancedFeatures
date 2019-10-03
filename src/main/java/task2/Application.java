package task2;

/*- Create a class “Person” which should model a Person from the municipality point of view
- Create getters and setters for the attributes
- Create a method “getPersonDetails” which would return the information related to that person
- Create an instance of the class and an application which would call the “getPersonDetails” and print the
return value*/
public class Application {

    public static void main(String[] args) {

        Person tantiLenuta = new Person("Tanti", "Lenuta", "Chinteni",
                "CJ123456", "2010456789013");

        System.out.println(tantiLenuta.getPersonDetails());
    }
}
