package task5_task6;

/* (a)
- Create a “Vehicle” class having a single attribute called maxSpeed visible only inside the class
- Make sure that it will be impossible to create an instance of the class without specifying a value for
maxSpeed
- Allow reading access for the defined maxSpeed attribute*/
// (b) see Car class
// (c) - make the maxSpeed field directly visible inside Car class
// (d) see Car class
// (e) see Car class
// (f) see Dealership_Main class

public class Vehicle {

//    private int maxSpeed; // (a)
    protected int maxSpeed; // (c)

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    } // (a)

    public int getMaxSpeed() {
        return maxSpeed;
    } // (a)
}
