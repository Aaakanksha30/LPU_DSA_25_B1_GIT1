import java.util.*;
public class prefixArray {
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        // Compute prefix sum array
        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // Compute maximum subarray sum
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1];
                
                if (currSum > maxSum) { 
                    maxSum = currSum;
                }
            }
        }
        System.out.println("maxSum = " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubarraySum(numbers);
        sc.close();
    }
}
