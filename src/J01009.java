import java.util.Scanner;

public class J01009 {
    static long factorial (long n){
        long res = 1;
        for (int i = 2; i <= n; i++){
            res *= i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for (int i = 1; i <= n; i++){
            sum += factorial(i);
        }
        System.out.println(sum);
    }
}
