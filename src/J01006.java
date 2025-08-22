import java.util.Scanner;

public class J01006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[] fibo = new long[92];
        fibo[0] = 1;
        fibo[1] = 1;

        for (int i = 2; i < 92; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0){
            int n = sc.nextInt();
            System.out.println(fibo[n-1]);
        }
    }
}
