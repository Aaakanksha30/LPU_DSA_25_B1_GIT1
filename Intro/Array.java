import java.util.*;
public class Array {
    public static void update(int marks[]){
        for(int i = 0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]){
        //Declaration and memory allocation
        //int [] marks = new int[5];
      // marks[0] = 40;
       // marks[1] = 60;
       // marks[2] = 40;
       // marks[3] = 50;
        //marks[4] = 30;
        //System.out.println(marks.length//);
       /*  Double [] marks = {78.53d, 98.45d, 86.57d,58.57d,90.56d};
        for(int i = 0; i<marks.length; i++)
        System.out.println(marks[i]);
        sc.close()*/
        int marks[] = {97,98,99};
        update(marks);
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }
}
