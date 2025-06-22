import java.util.*;
public class break_continue_using_loop {
    public static void main(String args[]){
        //for(int i = 0; i<50; i++){
      //   //   if(i==2){
          //      System.out.println("Akku is good");
          //      continue;
          //  }
          //  System.out.println(i);
          //  System.out.println("Akkku has started java");
    //}
    int i = 0;
        
    do {
        i++;
        if(i==2){
        System.out.println("Ending the loop");
         } continue; 
    } while (i < 5);  
    System.out.println(i); 
    System.out.println("Loop ends");
    sc.close();
}
}