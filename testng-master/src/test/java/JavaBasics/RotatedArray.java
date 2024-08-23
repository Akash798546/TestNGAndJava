package JavaBasics;

public class RotatedArray {

    public static int rotateArray(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            System.out.println("low: " + low + ", mid: " + mid + ", high: " + high); // Debug output

            if (arr[mid] == num) {
                return mid;
            }

            // Determine which part is sorted
            if (arr[low] <= arr[mid]) { // Left half is sorted
                if (num >= arr[low] && num < arr[mid]) {
                    high = mid - 1; // Search in the left half
                } else {
                    low = mid + 1; // Search in the right half
                }
            } else { // Right half is sorted
                if (num > arr[mid] && num <= arr[high]) {
                    low = mid + 1; // Search in the right half
                } else {
                    high = mid - 1; // Search in the left half
                }
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] a = {36, 64, 47, 86, 97, 23, 45}; // Example of a rotated array
        System.out.println("The index of value 36 is: " + rotateArray(a, 36));
        System.out.println("The index of value 47 is: " + rotateArray(a, 47));
        System.out.println("The index of value 45 is: " + rotateArray(a, 45));
    }
}
