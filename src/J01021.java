import java.math.BigInteger;
import java.util.Scanner;

public class J01021 {
    public static void main(String[] args) {
        final BigInteger MOD = BigInteger.valueOf(1000000007);
        Scanner sc = new Scanner(System.in);
        while (true){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if (a.equals(BigInteger.ZERO) && b.equals(BigInteger.ZERO)) break;
            BigInteger res = a.modPow(b, MOD);
            System.out.println(res);
        }
    }
}
