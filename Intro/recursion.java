public class recursion {    
    public static void printNaturalNumbers(int n) {
        if (n <= 0) {
            return ;
        }
        printNaturalNumbers(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int count = 10; 
        printNaturalNumbers(count);
    }
}

    
