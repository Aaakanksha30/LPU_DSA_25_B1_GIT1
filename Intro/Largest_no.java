import java.util.*;

public class Largest_no {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        
        System.out.println("Smallest value is: " + smallest);
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = {4, 8, 75, 89, 34, 2, 968};
        System.out.println("Largest value is: " + getLargest(numbers));
        sc.close();
    }
}
