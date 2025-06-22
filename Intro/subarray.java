import java.util.*;
public class subarray {
    public static void printSubarray(int numbers[]){
        int ts = 0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j = i+1; j<numbers.length; j++){
                int end = j;
                for(int k = i; k = j; k++){
                    System.out.print(numbers[k] +" ");
                }
                System.out.println();
                ts++;
            }
                System.out.println();
        }
        System.out.println("total Subarray = " + ts);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12};
        //printPairs(numbers);
    }
    
}


