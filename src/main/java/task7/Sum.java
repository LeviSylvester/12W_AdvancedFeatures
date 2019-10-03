package task7;
// (a) Define a method which computes the sum of integer numbers passed as an array.
/* (b) - compute the sum for a set of numbers passed as a single string
where the numbers are separated using comma */
public class Sum { //refactor when done

    // (a)
    public static int sumIntsAsArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // (b)
    public static int sumIntsAsString(String elements){
        int sum = 0;
        String[] nums = elements.split(", ");
        for (String num : nums){
            sum += Integer.parseInt(num);
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4};
        System.out.println(sumIntsAsArray(numbers));

        String elements = "1, 2, 3, 4";
        System.out.println(sumIntsAsString(elements));
    }


}
