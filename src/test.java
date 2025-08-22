import java.util.Scanner;

public class test {
    static double max (double x, double y, double z){
        if (x > y && x > z) return x;
        if (y > x && y > z) return y;
        return z;
    }

    static String dientichTamGiac (double x, double y, double z){

        if (x + y > z && x + z > y && y + z > x && x > 0 && y > 0 && z > 0){
            double p = (x+y+z) / 2;
            double s = Math.sqrt(p*(p-x)*(p-y)*(p-z));
            return String.valueOf(s);
        }
        return "khong phai canh tam giac";
    }

    static double sinx(double x, double epsilon){
        double term = x;
        double sum = 0;
        int n = 0;
        while (Math.abs(term) > epsilon){
            sum += term;
            n += 1;
            term = Math.pow(-1,n) * Math.pow(x,2 * n + 1) / factorial(2 * n + 1);
        }
        return  sum;
    }

    static  long factorial(int n){
        long r = 1;
        for (int i = 2; i <= n; i++){
            r *= i;
        }
        return  r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c,ep;
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        ep = in.nextDouble();
        System.out.println(max(a, b, c));
        System.out.println(dientichTamGiac(a, b, c));
        //System.out.println(String.format("%.4f", sinx(a, ep)));
    }
}
