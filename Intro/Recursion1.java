public class Recursion1 {
    public static void printdec(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printdec(n-1);
    }
    public static void printInc(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 10;
        printdec(n);
        printInc(n);
    }
}
