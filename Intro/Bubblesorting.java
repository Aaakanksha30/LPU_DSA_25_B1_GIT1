import java.util.*;
public class Bubblesorting{
  //  public static void BubbleSort(int arr[]){
   //     for(int turn=0; turn<arr.length-1; turn++){
   //         for(int j = 0; j<arr.length-1-turn; j++){
   //             if(arr[j] > arr[j+1]){
                //swaping
   //             int temp = arr[j];
   //             arr[j] = arr[j+1];
   //             arr[j+1] = temp;
   //             }
   //         }
   //     }
   // }
   // public static void printArr(int arr[]){
   //     for(int i = 0; i<arr.length; i++){
   //         System.out.print(arr[i] + " ");
   //     }
    //    System.out.println();
   // }
//    public static void main(String args[]){
   //    int arr[] = {5,1,4,2,8};
   //     BubbleSort(arr);
   //     printArr(arr);
   // }

 //  public static void BubbleSort(int arr[]){
 //   for(int turn = 0; turn<arr.length-1; turn++){
 //       for(int j = 0; j < arr.length-1-turn; j++){
 //           if(arr[j] > arr[j+1]){
 //               int temp = arr[j];
 //               arr[j] = arr[j+1];
 //               arr[j+1] = temp;
 //           }
 //       }
 //   }
 //  }
 //  public static void printArr(int arr[]){
 //   for(int i = 0; i<arr.length; i++){
 //       System.out.print(arr[i] + " ");
 //   }
 //   System.out.println();
 //  }
 //  public static void SelectionSort(int arr[]){
 //   for(int i = 0; i<arr.length-1; i++){
 //       int minPos = i;
 //       for(int j = i+1; j<arr.length-1; j++){
 //           if(arr[minPos] < arr[j]){
 //               minPos = j;
 //           }
 //       }
 //       int temp = arr[minPos];
 //       arr[minPos]  = arr[i];
 //       arr[i] = temp;
 //   }
 //  }
 //  public static void main(String args[]){
 //   int arr[] = {2,8,4,6,5,9,3};
 //   SelectionSort(arr);
 //   printArr(arr);
  // }
//}//

//Queation> 1
public static void BubbleSort(int arr[]){
    for(int turn=0; turn < arr.length-1; turn++){
        for(int j = 0; j < arr.length-1-turn; j++ ){
            if(arr[j] > arr[j+1]){
               int temp = arr[j];
               arr[j] = arr[j+1];
                arr[j+1] = temp;
                       }
                   }
               }
              }
          public static void printArr(int arr[]){
               for(int i = 0; i<arr.length; i++){
                 System.out.print(arr[i] + " ");
               }
                 System.out.println();
              }
          public static void SelectionSort(int arr[]){
               for(int i = 0; i<arr.length-1; i++){
                   int minPos = i;
                   for(int j = i+1; j<arr.length-1; j++){
                       if(arr[minPos] < arr[j]){
                           minPos = j;
                       }
                   }
                   int temp = arr[minPos];
                   arr[minPos]  = arr[i];
                       arr[i] = temp;
                   }
                }

                public static void InsertionSortDescending(int arr[]){
                    for(int i=1; i < arr.length; i++){
                        int curr = arr[i];
                        int prev = i-1;
                        while(prev >= 0 && arr[prev] < curr){
                            arr[prev+1] = arr[prev];
                            prev--;
                        }
                        arr[prev+1] = curr;
                    }
                }
                public static void countingSortDescending(int arr[]){
                    int largest = Integer.MIN_VALUE;
                    for(int i = 0; i<arr.length; i++){
                        largest = Math.max(largest,arr[i]);
                    }
                    int count[] = new int[largest+1];
                    for(int i = 0; i<arr.length;i++){
                        count[arr[i]]++;
                    }
                    int j = 0;
                    fot(int i = count.length-1; i>=0; i--){
                        while(count[i]  > 0) {
                            arr[j] = i;
                            j++;
                            count[i]--;
                        }
                    }
                }

                public static void main(String args[]) {
                    int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
                    InsertionSortDescending(arr);
                    countingSortDescending(arr);  // Now this will work!
                    printArr(arr);
                }
                
        }
    
