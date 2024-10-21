package Lab04;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14, 16};
        int target = 10;
        int result = binarySearch(sortedArray, target, 0, sortedArray.length - 1);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public static int binarySearch(int[] array, int target, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            return binarySearch(array, target, low, mid - 1);
        } else {
            return binarySearch(array, target, mid + 1, high);
        }
    }
}
