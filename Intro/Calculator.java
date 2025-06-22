import java.util.*;
public class Calculator {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, result;
        char operator;
        int operator = sc.nextInt()
    

        System.out.println("Welcome to the Akku Calculator :");
        System.out.print("Enter first number : ");
        num1 = sc.nextDouble();

        System.out.print("Enter second number : ");
        num2 = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, %): ");
      
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            case '%':
                result = num1 % num2;
                System.out.println("Result: " + num1 + " % " + num2 + " = " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } if else {
                    System.out.println(" Division by zero is not allowed.");
                }
                else {
                    System.out.println("% by zero is not allowed.");
                }
                break;
            default:
                System.out.println(" Invalid operator.");
                break;
        }

        sc.close();
    }
}