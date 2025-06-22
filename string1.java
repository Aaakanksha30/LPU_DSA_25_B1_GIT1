import java.util.*;
public class string1{
    public static void ,main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        System.out.println(str + " " + str1);
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('a', 2));
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.substring(2, 5));
        System.out.println(str.replace('a', 'b'));
    }
}