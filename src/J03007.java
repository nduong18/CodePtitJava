import java.util.Scanner;

public class J03007 {
    static boolean check(String line){
        if (line.charAt(0) != '8' || line.charAt(line.length()-1) != '8') return false;
        int sum = 0;
        for (int i = 0; i < line.length(); i++){
            sum += line.charAt(i) - '0';
        }
        return sum % 10 == 0;
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
