import java.util.Arrays;
import java.util.Scanner;

public class J01007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        long[] fibo = new long[92];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i < 92; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        while (t-- > 0) {
            long n = sc.nextLong();
            long pos = Arrays.binarySearch(fibo,n);
            if (pos >= 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
