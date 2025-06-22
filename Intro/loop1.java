import java.util.*;
public class loop1 {
    public static void main(String args[]){
        //int n = 5;
        //for(int i = n; i>0; i--){
        //    for(int j = 0; j<i; j++){
        // //       System.out.print("*");
        //    }
        //   
        //    System.out.println("\n");
        //}   
        //int i, j,k;
        //int n = 5;
       // for( i=0; i<n; i++)
        //{
       //     for(j = 1; j<=i; j++){
       //         System.out.print(" ");
       //     }
       //     for(k = 1; k <= n-i; k++){
       //         System.out.print("*");
       //     }
       //     System.out.println("");
        //}
        
             /*   int n = 5; 
        
                for (int i = 1; i <= n; i++) { 
                    for (int j = 1; j <= n; j++) { 
                                                
                         if (i == 1 || i == n || j == 1 || j == n) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  "); 
                        }
                    }
                    System.out.println(); 
                    sc.close;*/
           for(int i = 0; i<5; i++){
            for(int j = i; j<5; j++){
                if(int i+j ==5)
               System.out.println("*");
                else{
                    System.out.print(" ");

            }
           }

                }
            }
        
}