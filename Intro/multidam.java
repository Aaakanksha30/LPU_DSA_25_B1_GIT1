import java.util.*;
public class multidam {
    public static void main(String args[]){
       int [] [] flats = new int [2] [3];
        flats[0] [1] = 101;
        flats[0] [2] = 102;
        flats[0] [3] = 103;
        flats[1] [1] = 201;
        flats[1] [2] = 202;
        flats[1] [3] = 203;
        System.out.println("Printing a 2d array using for loop");
        for(int i = 0; i<flats.length; i++){
            for(int j = 0; i<flats[i].length; j++){
            System.out.print(flats[i][j]);
            System.out.println(" ");
        }
          System.out.println("");
        }
        sc.close();
}
}