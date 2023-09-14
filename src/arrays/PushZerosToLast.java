package arrays;

public class PushZerosToLast {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 0, 3, 0, 5, 6, 0, 7 };

        System.out.println("Original Array:");
        printArray(arr);

        pushZerosToLast(arr);

        System.out.println("Array with Zeros Pushed to Last:");
        printArray(arr);
    }

    public static void pushZerosToLast(int[] arr) {
        int n = arr.length;
        int count = 0; // Count of non-zero elements

        // Traverse the array, move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        // Fill the remaining positions with zeros
        while (count < n) {
            arr[count] = 0;
            count++;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
