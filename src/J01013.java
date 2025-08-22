import java.awt.*;
import java.util.Scanner;

public class J01013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        int totalSum = 0;
        while (t-- > 0){
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 2; i <= Math.sqrt(n); i++){
                while (n % i == 0){
                    sum += i;
                    n /= i;
                }
            }
            if (n > 1) sum += n;
            totalSum += sum;
        }
        System.out.println(totalSum);
    }
}
