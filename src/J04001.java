import java.util.Scanner;

public class J04001 {
    public static class Point{
        private double x;
        private double y;

        public Point(){}

        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }
        public double distance(Point secondPoint){
            return Math.sqrt((this.x - secondPoint.x)*(this.x - secondPoint.x) + (this.y - secondPoint.y)*(this.y - secondPoint.y));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            Point p1 = new Point(x1,y1);
            Point p2 = new Point(x2,y2);
            System.out.printf("%.4f\n", p1.distance(p2));
        }
    }
}
