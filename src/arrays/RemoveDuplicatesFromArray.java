package arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3 };
        
        int newSize = removeDuplicates(arr);
        
        System.out.println("Array with duplicates removed:");
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static int removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1) {
            return n;
        }
        
        int newSize = 1;
        for (int i = 1; i < n; i++) {
            boolean isDuplicate = false;
            
            for (int j = 0; j < newSize; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            if (!isDuplicate) {
                arr[newSize] = arr[i];
                newSize++;
            }
        }
        
        return newSize;
    }
}
