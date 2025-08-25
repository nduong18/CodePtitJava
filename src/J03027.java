import java.util.Scanner;

public class J03027 {
    static int index = 0;
    static boolean check(String s){
        for (int i = 0; i < s.length() - 1; i++){
            if (s.charAt(i) == s.charAt(i+1)) {
                index = i;
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        while (check(sb.toString())){
            sb.deleteCharAt(index);
            sb.deleteCharAt(index);
        }
        if (sb.toString().isEmpty()) System.out.println("Empty String");
        else System.out.println(sb);
    }
}
