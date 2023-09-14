package arrays;

public class HalfSort {

	public static void main(String[] args) {
        int[] arr = {5, 9, 2, 7, 1, 8};  // Input array
        
        // Display original array
        System.out.println("Original array:");
        printArray(arr);
        
        int length = arr.length;
        int mid = length / 2;  // Find the middle index
        
        // Sort first half in ascending order
        for (int i = 0; i < mid - 1; i++) {
            for (int j = i + 1; j < mid; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        // Sort second half in descending order
        for (int i = mid; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        // Display sorted array
        System.out.println("Sorted array with first half ascending and second half descending:");
        printArray(arr);
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
