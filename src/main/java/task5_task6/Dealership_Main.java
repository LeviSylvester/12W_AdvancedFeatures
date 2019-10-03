package task5_task6;

/* (f) Inside a new runnable class, create a method capable of printing the maxSpeed value of any Vehicle.
Is it possible to use it in order to print the maxSpeed for a Car?*/

public class Dealership_Main {

    private static void printMaxSpeed(Vehicle vehicle) {
        System.out.println(vehicle.getMaxSpeed());
    }

    public static void main(String[] args) {
        Car myCar = new Car(200, false);

/* Yes it is indeed very much possible to put a car (child) in place of the method's vehicle (parent) parameter
due to Inheritance:)*/
        printMaxSpeed(myCar);
    }
}
