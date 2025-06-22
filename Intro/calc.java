import java.util.*;
public class calc {
    public static void main(String args[]){
        Scanner sc = new Scanner(system.in){
            double num1, num2, result;
            char operator;
            int operator = sc.nextInt()
            System.out.println("Welcome to my calculator : ");
            System.out.println("Enter the number 1: ");
            num1 = sc.nextDouble();

            System.out.println("Enter the number 2: ")
            num2 = sc.nextDouble();
            System.out.println("Enter the operator(+, -, *, /, %)");
            System.out.println("1. Add , + " +);
            System.out.println("2. Subtract , - " -);
            System.out.println("3. multiply , * " *);
            System.out.println("4. divide , / " /);
            System.out.println("5. mod , % " %);
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("result  = "+num1+" + "+num2+" : " = " "result");

                case '-':
                    result = num1 + num2;
                    System.out.println("result  = "+num1+" - "+num2+" : " = " "result");
                case '*':+
                    result = num1 + num2;
                    System.out.println("result  = "+num1+" * "+num2+" : " = " "result");
                case '/':
                    result = num1 + num2;
                    System.out.println("result  = "+num1+" / "+num2+" : " = ");
                case '%':
                    result = num1 + num2;
                    System.out.println("result  = "+num1+" % "+num2+" : " = ");



        }
    }
    
}
