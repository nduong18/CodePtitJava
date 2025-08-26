import java.util.Locale;
import java.util.Scanner;

public class J04010 {
    static double doDai(Point p1, Point p2){
        return Math.sqrt((p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y));
    }
    static void dienTichHinhTronNgoaiTiep(Point p1, Point p2, Point p3){
        double a = doDai(p1,p2);
        double b = doDai(p2,p3);
        double c = doDai(p1,p3);
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) System.out.println("INVALID");
        else{
            double p = (a + b + c) / 2;
            double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            double r = (a*b*c) / (4*s);
            double S = Math.PI * r * r;
            System.out.printf(Locale.US, "%.3f\n",S);
        }
    }
    static class Point{
        final public double x;
        final public double y;
        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            double x1 = sc.nextDouble(), y1 = sc.nextDouble(),
                    x2 = sc.nextDouble(), y2 = sc.nextDouble(),
                    x3 = sc.nextDouble(), y3 = sc.nextDouble();
            Point p1 = new Point(x1,y1);
            Point p2 = new Point(x2,y2);
            Point p3 = new Point(x3,y3);
            dienTichHinhTronNgoaiTiep(p1,p2,p3);
        }
    }
}
