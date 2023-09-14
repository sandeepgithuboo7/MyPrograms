package arrays;

public class FrequencyCounter {

	public static void main(String[] args) {
        int[] arr = {2, 3, 2, 2, 4, 3, 4, 7, 8, 4, 7};  // Input array
        
        // Display original array
        System.out.println("Original array:");
        printArray(arr);
        
        int n = arr.length;
        boolean[] visited = new boolean[n];  // To keep track of visited elements
        
        // Calculate frequencies of elements
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;  // Skip if element is already counted
            }
            
            int freq = 1;
            
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                    visited[j] = true;  // Mark element as visited
                }
            }
            
            // Display frequency of current element
            System.out.println(arr[i] + ": " + freq);
        }
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
