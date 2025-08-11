import java.util.Scanner;

public class J01002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            long n = Integer.parseInt(sc.nextLine());
            long sum = (n * (n+1)) / 2;
            System.out.println(sum);
        }
    }
}
