package task4;
/*- Create a “TestNumber” class containing a utility method which computes the sum for an array of
numbers
- Create a number array holding a Byte, an Integer, a Float and a Double and call the method to compute
the sum*/
public class TestNumber {
    public static double sum(Number[] nums) {
        double sum = 0.0;
        for (Number num : nums) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] s) {
        Number[] nums = new Number[4];
        nums[0] = new Byte((byte) 10);
        nums[1] = new Integer(10);
        nums[2] = new Float(10.0f);
        nums[3] = new Double(10.0d);
        System.out.println("The sum of numbers is: " + sum(nums));
    }
}
