import java.util.*;
public class Linearsearch {
    public static int Linearsearch(int numbers[],int key){
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    //public static void main(String args[]){
       /*  int numbers[] = {2,4,6,8,19,15,26,37};
        int index = Linearsearch(numbers, key)
        int key = 15;
        if(index == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("The key is at index or founded by me :  " + index);
        }
    }*/
    public static void main(String[] args) {
        String menu[] = {"Idli", "Dosa", "Roti", "Chawal"};
        String key = "Chawal";

        int index = Linearsearch(menu, key);

        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("The key is at index: " + index);
        }
    }
}