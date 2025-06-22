import java.util.*;
public class arrayques {
    /*public static void reversearray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;       //1523 //125 leetcode
            end--;
        }
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        reversearray(arr);
        System.out.println("Reversed array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}*/
    /*public static int max(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5};
        int maxValue = max(numbers);
        System.out.println("The maximum value is: " + maxValue);
        for(int i =0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }*/
    /*public static void countEvenOdd(int arr[]) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};     
        countEvenOdd(arr); 
}
}*/
// Program to find the second largest number in an array
    /*public static void main(String[] args) {
        int[] arr = {8, 7, 3, 2, 8, 1};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("The second largest number is " + second);
        }
    }*/
    //find the  first repeating element in an array
    public static void main(String args[]){
     /*    int arr [] = {1,2,3,3,4,5,6,7,45,34,87,45,23,13,14,13};
        int repeating = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    repeating = arr[i];
                    break;
                }
            }
            if (repeating != -1) {
                break;
            }
        }
        if (repeating != -1) {
            System.out.println("First repeating element is: " + repeating);
        } else {
            System.out.println("No repeating elements found.");
        }*/
        public static boolean isSorted(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
        if (arr[i - 1] > arr[i]) {
            return false;
        }
    }
    return true;
}

        int arr[] = {1, 2, 3, 4, 5};
        if (isSorted(arr)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}

//(1,0,0,1,1,1,0) count the number of 0, or 1;
//{4,,7,8,3,1,10,17} k= 9 -> count the number of element greater than k