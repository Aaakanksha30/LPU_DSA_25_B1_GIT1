// take 2 numbers as user input and print the largest one
import java.util.*;
public class Largest_Of_Two_Number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element 1 : ");
        double a  = sc.nextDouble();
        System.out.print("Enter the element 2 : ");
        double b = sc.nextDouble();
        // if(a<=b){
        //     System.out.println(b+" is largest");
        // }
        // else{
        //     System.out.println(a+" is largest");
        // }
        double max = (a<=b)?b:a;
        System.out.println(max+" is largest");
sc.close();
    }
}