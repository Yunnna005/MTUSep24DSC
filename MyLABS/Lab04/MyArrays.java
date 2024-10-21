package Lab04;

public class MyArrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum of the array: " + sum(numbers, 0));
    }

    public static int sum(int [] values, int index){
        if (values.length == 0) {
            return 0;
        }
        if (values.length == 1) {
            return values[0];
        }
        if (index == values.length) {
            return 0;
        }
        // Recursive case: add the current element to the sum of the rest
        return values[index] + sum(values, index + 1);
    }
}
