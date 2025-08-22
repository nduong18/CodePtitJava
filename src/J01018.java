import java.util.Scanner;

public class J01018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0){
            String n = sc.nextLine();
            int sumDigit = 0;
            boolean check = true;
            for (int i = 0; i < n.length() - 1; i++){
                sumDigit += n.charAt(i) - '0';
                if (Math.abs(n.charAt(i) - n.charAt(i+1)) != 2){
                    check = false;
                    break;
                }
            }

            if (check && (sumDigit + (n.charAt(n.length() - 1) - '0')) % 10 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
