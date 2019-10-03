package task3;

public class Circle extends Shape {
    private int radius;

    public void computeAndPrintArea() {
        System.out.println(Math.PI * radius * radius);
    }

    void printFillColor() {
        System.out.println(colorCode);
    }
}