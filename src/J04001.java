import java.util.Scanner;

public class J04001 {
    public static class Point{
        double x;
        double y;
        public Point(double x, double y){
            x = this.x;
            y = this.y;
        }
        double getX(){
            return this.x;
        }
        double getY(){
            return this.y;
        }
        double distance(Point secondPoint){
            return Math.sqrt((this.x - secondPoint.x)*(this.x - secondPoint.x) + (this.y - secondPoint.y)*(this.y - secondPoint.y));
        }
        double distance(Point p1, Point p2){
            return Math.sqrt((p1.x - p2.x)*((p1.x - p2.x) - (p1.y - p2.y)*(p1.y - p2.y)));
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}
