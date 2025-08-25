import java.util.Scanner;

public class J03021 {
    static char value(char c){
        switch (c) {
            case 'A': case 'B': case 'C':
                return '2';
            case 'D': case 'E': case 'F':
                return '3';
            case 'G': case 'H': case 'I':
                return '4';
            case 'J': case 'K': case 'L':
                return '5';
            case 'M': case 'N': case 'O':
                return '6';
            case 'P': case 'Q': case 'R': case 'S':
                return '7';
            case 'T': case 'U': case 'V':
                return '8';
            case 'W': case 'X': case 'Y': case 'Z':
                return '9';
            default:
                return c;
        }
    }


    static boolean isPalindrome(String s){
        int l = 0, r = s.length()-1;
        while (l <= r){
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String x = sc.nextLine().toUpperCase();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < x.length(); i++){
                sb.append(value(x.charAt(i)));
            }
            String result = sb.toString();
            if (isPalindrome(result)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
