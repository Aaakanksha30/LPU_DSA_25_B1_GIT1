import java.util.Scanner;

// import java.util.*;
public class trail_switch {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of week ");
        int n = sc.nextInt();
        switch(n)
        {
            case 1: System.out.println("Monday");
                    break;
            default:System.out.println("Not a Day");
                    break;
            case 2: System.out.println("Tuesdau");
                    break;
            case 5: System.out.println("Friday");
                    break;
            case 6: System.out.println("Saturday");
                    break;
            case 7: System.out.println("Sunday");
                    break;
            case 3: System.out.println("Wednesday");
                    break;
            case 4: System.out.println("Thursday");
                    break;
                
        }
        sc.close();
    }
    
}
