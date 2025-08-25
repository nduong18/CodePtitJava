import java.math.BigInteger;
import java.util.Scanner;

public class J03011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0){
            BigInteger x1 = sc.nextBigInteger();
            BigInteger x2 = sc.nextBigInteger();
            BigInteger gcd = x1.gcd(x2);
            System.out.println(gcd);
        }
    }
}
