import java.util.Scanner;

public class J03024 {
    static String solve(String s){
        int evenCnt = 0, oddCnt = 0;
        int len = s.length();
        for (int i = 0; i < len; i++){
            if (!Character.isDigit(s.charAt(i))) return "INVALID";
            if ((s.charAt(i) - '0') % 2 == 0) evenCnt++;
            else oddCnt++;
        }
        if ((len % 2 == 0 && evenCnt > oddCnt)
        || (len % 2 != 0 && oddCnt > evenCnt)) return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String s = sc.nextLine();
            System.out.println(solve(s));
        }
    }
}
