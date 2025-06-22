import java.util.*;
public class Cal2 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        double num1,num2;
        int op;
        System.out.println("Enter in my calculator");
        System.out.println("Enter the number1");
        num1 = sc.nextDouble();
        System.out.println("Enter the number2");
        num2 = sc.nextDouble();
        System.out.println("Enter the operator(+, -, *, /, %)");
        System.out.println("1. Add  + ");
        System.out.println("2. Subt - ");
        System.out.println("3. Multi * ");
        System.out.println("4. Divide / ");
        System.out.println("5. Mod  %");
        op = sc.nextInt();
        switch(op)
        {       
              case 1: System.out.println("Sum : " + (num1+num2) );
                        break;
              case 2:
                        System.out.println("Difference : " + (num1-num2 ) );
                        break;
              case 3 :
                        System.out.println("Product : " +  (num1*num2));
                        break;
              case 4 :
                        System.out.println("Quotient :"+ (num1/num2));
                        break;
              case 5 :
                        System.out.println("Remainder :"+ (num1%num2));
                        break;
              default:
                        System.out.println("Invalid Input");
        }
        sc.close();
    }  
}
