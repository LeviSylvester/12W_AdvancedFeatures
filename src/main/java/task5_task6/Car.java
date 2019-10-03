package task5_task6;
// (a) see Vehicle class
/* (b) - Create a “Car” class; it should use the code already written for “Vehicle” class
- It should also have the convertible* attribute,
visible only inside the class with a default value of false
- Allow reading access for the defined convertible* attribute
*/
// (c) see Vehicle class
// (d) What do you think would happen if we would declare a double private field called the same inside Car class?
/* (e) Are we still able to access the field in the parent class inside the child class (after (d))?
Try to write a getter returning the maxSpeed field in the parent class. */

//*corrected from: isConvertible
public class Car extends Vehicle {

//    private double maxSpeed; // (d) -> Field hiding. Possible, but not recommended; bad practice.

    private boolean convertible = false; // (b)

    public Car(int maxSpeed, boolean convertible) { // (b)
        super(maxSpeed);
        this.convertible = convertible;
    }

    public boolean isConvertible() { // (b)
        return convertible;
    }

//    public int getParentHiddenMaxSpeed(){ // (e) hidden by declaring private state with same name (any type) in Car class
//        return super.maxSpeed; //solved by using super.
//    }

}
