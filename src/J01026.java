import java.util.Scanner;

public class J01026
{
    public static boolean check(double x){
        long z = (long) Math.sqrt(x);
        return z*z == x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            double x = sc.nextDouble();
            if (check(x)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
/*
*
3
11
121
361

* */