import java.util.*;
public class Pass_fail {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the student's marks : ");
        int marks = sc.nextInt();
        if(marks < 500 && marks >= 165){
            System.out.println("Student has passed in exam: ");
        } 
        else if(marks < 165 && marks == 0) {
            System.out.println("Student has failed in exam :");
        }
        else {
            System.out.println("Invalid marks :");
        }
        sc.close();
    }
    
} 
