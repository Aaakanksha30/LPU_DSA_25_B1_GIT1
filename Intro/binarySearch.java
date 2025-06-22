import java.util.*;

public class binarySearch {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; 
            if (numbers[mid] == key) {
                return mid; 
            } 
            if (numbers[mid] < key) {
                start = mid + 1; 
            } else {
                end = mid - 1; 
            }
        }
        return -1; 
    }

    public static void main(String args[]) {
        int numbers[] = {2, 3, 5, 7, 14, 18, 19};
        int key = 10;

        int index = binarySearch(numbers, key);
        if (index != -1) {
            System.out.println("Key found at index: " + index);
        } else {
            System.out.println("Key not found in the array.");
        }
        sc.close();
    }
}
