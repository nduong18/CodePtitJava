import java.util.Scanner;

public class J04002 {
    public static class Rectange {
        private double width;
        private double height;
        private String color;
        public Rectange(){}
        public Rectange(double w, double h, String c){
            this.width = w;
            this.height = h;
            this.color = c;
        }
        public double getWidth() {return this.width;}
        public double getHeight() {return this.height;}
        public String getColor() {return  this.color.toUpperCase().charAt(0) + this.color.toLowerCase().substring(1);}
        public double chuVi(){
            return (this.height + this.width) * 2;
        }
        public double dienTich(){
            return this.width * this.height;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String c = sc.next();
        Rectange hcn = new Rectange(a,b,c);
        if (hcn.getHeight() <= 0 || hcn.getWidth() <= 0) System.out.println("INVALID");
        else System.out.printf("%.0f %.0f %s",hcn.chuVi(), hcn.dienTich(), hcn.getColor());
    }
}
