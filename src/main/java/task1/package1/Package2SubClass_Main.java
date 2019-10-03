package task1.package1;
/*- Create a new maven project. Create two different packages within “src/main/java” path.
- Create two classes with the same name, each in different package
- Add in each of the class four field using the four access modifiers
- Create a third class with the main function; instantiate the previously created classes and try to access
their attributes using “.”*/
public class Package2SubClass_Main extends task1.package2.MyClass {
    private String this_privateField;
    String this_defaultField;
    protected String this_protectedField;
    public String this_publicField;

    public static void main(String[] args) {

                            //I. accessing attributes (states) from the same class:

        Package2SubClass_Main object = new Package2SubClass_Main();
        System.out.println(object.this_privateField +
                           object.this_defaultField +
                           object.this_protectedField +
                           object.this_publicField);

                            //II. same package:

        MyClass object1 = new MyClass();
        System.out.println(//object1.privateField + //not visible
                           object1.defaultField +
                           object1.protectedField +
                           object1.publicField);

                            //III. subclass (from other package):

        System.out.println(//object.privateField + //not visible
                           //object.defaultField + //not visible
                           object.protectedField +
                           object.publicField);

                            //IV. other class (from other package):

        task1.package2.MyClass object2 = new task1.package2.MyClass();
        System.out.println(//object2.privateField + //not visible
                           //object2.defaultField + //not visible
                           //object2.protectedField + //not visible
                           object2.publicField);
    }
}
