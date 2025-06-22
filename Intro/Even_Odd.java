import java.util.*;
public class Even_Odd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element 1 : ");
        double a = sc.nextDouble();
        if(a % 2 == 0){
            System.out.println( a + " Element is even number: ");
        }
        else{
            System.out.println(a+ "Element is odd number : ");
        }
        sc.close();
    }
}
