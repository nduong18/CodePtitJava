import java.util.Scanner;

public class J03006 {
    static  boolean check(String line){
        int l = 0, r = line.length() - 1;
        while (l <= r){
            if (line.charAt(l) != line.charAt(r) || (line.charAt(l) - '0') % 2 != 0)
                return false;
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
