import java.util.*;
public class Array2 {
    public static void main(String[] args) {
      // int[] arr = {10, 20, 30, 40, 50};
       /*int [] arr = new int[5];
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 5 elements for the array:");
       int sum = 0;
       System.out.println("Array elements:");
         for(int i = 0; i<5; i++){
                System.out.print(arr[i] + " ");
                sum += arr[i];
          }
         System.out.println("\nSum of array elements: " + sum);*/

    
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 elements for the array:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        System.out.println("Array elements:");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println("\nSum of array elements: " + sum);

        sc.close();
    }
}
        

