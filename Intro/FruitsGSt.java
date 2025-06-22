import java.util.*;
public class FruitsGSt {
    public static void main(String args[]){
        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of Pencil : ");
        double a1 = sc.nextDouble();
        System.out.println("Enter the price of Pen : ");
        double a2 = sc.nextDouble();
        System.out.println("Enter the price of Eraser : ");
        double a3 = sc.nextDouble();
        // Claculating the sum
        double sum = (a1+a2+a3);
        System.out.println("Total Price = "+sum);
        // Cal bill with 18% ADD-ON GST
        System.out.println("Total Price +18%gst= "+ 1.18*sum);
        sc.close();
    }
} 

    

