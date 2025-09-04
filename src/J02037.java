import java.util.Scanner;

public class J02037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            int cntEven = 0, cntOdd = 0;
            String[] str = sc.nextLine().trim().split("\\s+");
            for (String s : str){
                if ((s.charAt(s.length() - 1) - '0') % 2 == 0) cntEven++;
                else cntOdd++;
            }
            if ((cntEven > cntOdd && str.length % 2 == 0)
                    || (cntEven < cntOdd && str.length % 2 != 0))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
