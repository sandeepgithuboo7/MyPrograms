package arrays;

public class ThirdSmallestElement  {

	public static void main(String[] args) {
        int[] array = {12, 5, 7, 9, 3, 2};
        int thirdSmallest = findThirdSmallest(array);
        System.out.println("The 3rd smallest element is: " + thirdSmallest);
    }
    
    public static int findThirdSmallest(int[] arr) {

        int n = arr.length;
        
        if (n < 3) {
            System.out.println("Array has less than 3 elements.");
            return -1;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int thirdSmallest = Integer.MAX_VALUE;
        
        for (int num : arr) {
            if (num < smallest) {
                thirdSmallest = secondSmallest;
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                thirdSmallest = secondSmallest;
                secondSmallest = num;
            } else if (num < thirdSmallest && num != smallest && num != secondSmallest) {
                thirdSmallest = num;
            }
        }
        
        return thirdSmallest;
    }
}
