import java.util.*;
public class Student2 { 
    public String name;                     //constructor code
    public int age;
    public int rollNumber;

     Student2 (String studentName, int studentAge , int rollNumber) {
        this.name = studentName;
        this.age = studentAge;
        this.rollNumber = rollNumber;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }

    public static void main(String[] args) {
        Student2 student1 = new Student2("Alice", 20, 45);
        student1.displayStudentInfo();

        System.out.println("\n---");

        Student2 student2 = new Student2("Bob", 22, 34);
        student2.displayStudentInfo();

        System.out.println("\n---");
    }
}


