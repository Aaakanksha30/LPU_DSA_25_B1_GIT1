import java.util.*;
public class Average_Gst {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the pencil :");
        double v1 = sc.nextDouble();
        System.out.println( "Enter the pen :");
        double v2 = sc.nextDouble();
        System.out.println( "Enter the eraser :");
        double v3 = sc.nextDouble();
        double  result = (v1+v2+v3) ;
        System.out.println("result without Gst :" + result);
        double pencil =v1*(18.0/100);
        System.out.println(pencil);
        double pen  =  v2*(18.0/100);
        double eraser =v3* (18.0/100);
        double totalgst = pencil + pen+ eraser;
        double  result2 = (v1 + v2 + v3) + totalgst ;
        System.out.println("result with Gst :" + result2);


        sc.close();


    }
    }
    

