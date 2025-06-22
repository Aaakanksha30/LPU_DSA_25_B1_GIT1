// Take the radius as user input and print the perimeter and area of the circle
import java.util.*;
public class circle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r = sc.nextDouble();
        double p = 2*3.14*r;
        System.out.println("Perimeter : "+ p );
        double a = 3.14*r*r;
        System.out.printf("area : %.2f",a);

        sc.close();

    }
    
}
