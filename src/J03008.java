import java.util.Scanner;

public class J03008 {
    static boolean check(String line){
        int l = 0, r = line.length() - 1;
        while (l <= r){
            char x = line.charAt(l);
            char y = line.charAt(r);
            if ((x != '2' && x != '3' && x != '5' && x != '7')) return false;
            if (y != '2' && y != '3' && y != '5' && y != '7') return false;
            if (x != y) return false;
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
            String line = sc.nextLine();
            if (check(line)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
