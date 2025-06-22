import java.util.*;
public class average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the element 1 :");
        double v1 = sc.nextDouble();
        System.out.println( "Enter the element 2 :");
        double v2 = sc.nextDouble();
        System.out.println( "Enter the element 3 :");
        double v3 = sc.nextDouble();
        double  result = (v1+v2+v3) / 3;
        System.out.println("result :" + result);
        sc.close();
    }
    
}
