import java.util.Locale;
import java.util.Scanner;

public class J04019 {
    static class Point{
        private double x, y;
        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }
        public double distance(Point other){
            double dx = this.x - other.x;
            double dy = this.y - other.y;
            return Math.sqrt(dx * dx + dy * dy);
        }
         public static Point nextPoint(Scanner sc){
            return new Point(sc.nextDouble(), sc.nextDouble());
        }
    }
    static class Triangle{
        private final Point a, b, c;
        public Triangle(Point a, Point b, Point c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public boolean valid(){
            double A = a.distance(b);
            double B = a.distance(c);
            double C = b.distance(c);
            return A + B > C && A + C > B && B + C > A;
        }
        public String getPerimeter(){
            double A = a.distance(b);
            double B = a.distance(c);
            double C = b.distance(c);
            return String.format(Locale.US ,"%.3f", A + B + C);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
