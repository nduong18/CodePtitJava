import java.util.Scanner;

public class J03025 {
    static boolean check(String s){
        int l = 0, r = s.length() - 1;
        int diff = 0;
        while (l < r){
            if (s.charAt(l) != s.charAt(r)) diff++;
            l++;
            r--;
        }
        if (diff == 1) return true;
        if (diff == 0) return s.length() % 2 != 0;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String s = sc.nextLine();
            if (check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
