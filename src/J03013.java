import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            BigInteger x = sc.nextBigInteger();
            BigInteger y = sc.nextBigInteger();
            BigInteger result = x.subtract(y).abs();
            int cntX = x.toString().length();
            int cntY = y.toString().length();
            int maxLen = Math.max(cntX, cntY);
            int cntR = result.toString().length();
            if (cntR < maxLen) {
                String padded = String.format("%0" + maxLen + "d", result);
                System.out.println(padded);
            } else {
                System.out.println(result.toString());
            }
        }
    }
}
