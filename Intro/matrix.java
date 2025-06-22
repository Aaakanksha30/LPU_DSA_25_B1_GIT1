import java.util.*;
public class matrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[2][2]; 
        System.out.println("Enter elements of 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close(); 
    }
}
