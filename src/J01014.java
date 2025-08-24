import java.util.Scanner;

public class J01014 {
    static boolean isPrime(long n){
        if (n < 2) return false;
        long limit = (long)Math.sqrt(n);
        for (long i = 2; i <= limit; i++){
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0){
            long n = sc.nextLong();
            if (isPrime(n)) System.out.println(n);
            else{
                long result = 0;
                for (long i = 2; i <= Math.sqrt(n); i++){
                    while (n % i == 0){
                        result = i;
                        n /= i;
                    }
                }

                if (n > 1 && n > result) result = n;
                System.out.println(result);
            }
        }
    }
}
