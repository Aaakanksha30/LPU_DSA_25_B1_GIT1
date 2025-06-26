public class stringbuilding {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char  ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch);
        }
        for(int i  = '10'; i <= '100'; i++){
            sb.append(i);
        }
        System.out.println(sb);
    }
}
