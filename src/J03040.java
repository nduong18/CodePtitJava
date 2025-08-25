import java.util.Scanner;

public class J03040 {
    static boolean check(String s){
        boolean check1 = true, check2 = true, check3 = true, check4 = true;
        for (int i = 0; i < s.length() - 1; i++){
            if (s.charAt(i+1) <= s.charAt(i)) {
                check1 = false;
                break;
            }
        }
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(0) != s.charAt(i)) {
                check2 = false;
                break;
            }
        }
        if (s.charAt(0) != s.charAt(1) || s.charAt(0) != s.charAt(2) || s.charAt(3) != s.charAt(4)) check3 = false;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != '6' && s.charAt(i) != '8'){
                check4 = false;
                break;
            }
         }
        return check1 || check2 || check3 || check4;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder(s.substring(5));
            sb.deleteCharAt(3);
            if (check(sb.toString())) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
