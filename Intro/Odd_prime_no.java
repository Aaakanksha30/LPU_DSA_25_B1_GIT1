import java.util.*;
public class Odd_prime_no{
    public static void main(String args[]){
        Scanner sc = new.Scanner(System.in);
        System.out.println("Enter m :");
        int m = sc.nextInt();
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Odd prime numbers between " + m + " and " + n + ":");
        for(int i = m; i<=n; i++){
            if (n%i==0) {
            System.out.println(i);
        }
        }
    
    scanner.close();

    } 
}