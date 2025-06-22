import java.util.*;

public class Largestno {
    public static void printSubarraySum(int number[]){
        for(int i = 0; i<numbers.length; i++){
            int currSum = 0;
            int maxSum = Integer.MIN_VALUE;
            for(int i = 0; i<numbers.length; i++){
                int start= i;
                for(int j = 0; j<numbers.length; j++){
                    int end = j;
                    currSum = 0;
                    for(int k = start; k<=end; k++){
                        currSum += numbers[k];
                    }
                    System.out.println(currSum);
                    if(maxSum < currSum){
                        maxSum = currSum;
                    }
                    
                }
               
            }
            System.out.println("max sum = " + maxSum);

        }
    }
    /*public static void printSubarray(int numbers[]){
        for(int i =0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j< numbers.length; j++){
                int end = j;
                for(int k = start; k<=end; k++){//only for print 
                    System.out.print(numbers[k]+" "); //subarray
                }
                System.out.println();
            }
        } 
    } */
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarray(numbers);
    }
    }
   /*public static void printPairs(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println("(" + curr + ", " + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs = " + tp);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        printPairs(numbers);
    }
}*/
   /*  public static void reverse(int numbers[]){
        int first = 0;
        int last = numbers.length-1;
        while(first < last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        reverse(numbers);
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();
    }*/
    /*public static int binarysearch(int numbers[],int key){
        int start = 0; 
        int end = numbers.length-1;
        while(start <= end){
            int mid = (start + end ) / 2;
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 12;
        System.out.println("index for key is: " + binarysearch(numbers, key));
    }*/

    /*public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; 
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is : " + smallest);
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = {1, 2, 4, 7, 8};
        System.out.println("Largest value is: " + getLargest(numbers));
    }*/

