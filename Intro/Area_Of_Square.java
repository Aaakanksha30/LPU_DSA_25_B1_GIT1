import java.util.*;
public class Area_Of_Square {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element a");
        double s = sc.nextDouble();
        double a = s*s;
        System.out.printf("area : %.2f",a);
        sc.close();
    }
}
