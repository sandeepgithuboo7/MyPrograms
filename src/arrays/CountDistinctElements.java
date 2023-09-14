package arrays;

public class CountDistinctElements {

	public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 8 };
        
        int distinctCount = countDistinctElements(array);
        
        System.out.println("Number of distinct elements: " + distinctCount);
    }
    
    public static int countDistinctElements(int[] arr) {
        int n = arr.length;
        int distinctCount = 0;
        boolean isDistinct;
        
        for (int i = 0; i < n; i++) {
            // Assume current element is distinct
            isDistinct = true;
            
            // Check if the element is repeated before this index
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDistinct = false;
                    break;
                }
            }
            
            // If the element is distinct, increment the count
            if (isDistinct) {
                distinctCount++;
            }
        }
        
        return distinctCount;
    }
}
