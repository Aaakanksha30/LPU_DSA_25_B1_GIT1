import java.util.*;
      /*  public class pattern {
    public static String getName() {
        return "Akanksha Singh";
    }
    public static void main(String[] args) { 
        String myName = getName();
        System.out.println("My name is: " + myName);
    }
}*/
public class pattern {

    public static void coffee(int cups) {
        System.out.println("You ordered " + cups + " cup(s) of coffee.");
    }
    public static void coffee(String size) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Do you want sugar? (yes/no): ");
        String sugar = sc.nextLine();

        System.out.println("You ordered a " + size + " coffee" + 
             (sugar.equalsIgnoreCase("yes") ? " with sugar." : " without sugar."));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of coffees: ");
        int numberOfCups = sc.nextInt();
        coffee(numberOfCups);

        sc.nextLine(); 
        System.out.print("Choose size (small/medium/large): ");
        String size = sc.nextLine();
        coffee(size);
    }
}



