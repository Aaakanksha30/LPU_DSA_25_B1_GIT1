import java.util.*;
public class Strings {
    public static void printLetters(String str){
        for(int i = 0; i<str.length(); i++){
            System.out.println(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) == str.charAt(n-1-i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        /*char arr[] = {'a', 'b', 'c','d'};
        String str = "abcd";
        String str2 = new String("sdfg");
        Scanner sc  = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
        */
        //String fullName = "Akanksha Singh";
        //System.out.println(fullName.length());

        //Cancatenation
        //String firstName = "Akanksha";
        //String lastName = "Singh";
        //String fullName = firstName + " " + lastName;
        //System.out.println(fullName.charAt(1));
        //prin//tLetters(fullName);
        String str = "racecar";
        System.out.println(isPalindrome(str));


    }
}
