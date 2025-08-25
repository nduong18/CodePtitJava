import java.math.BigInteger;
import java.util.Scanner;

public class J03033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger gcd = a.gcd(b);
            BigInteger lcm = a.multiply(b).abs().divide(gcd);
            System.out.println(lcm);
        }
    }
}
