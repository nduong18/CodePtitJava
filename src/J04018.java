import java.util.*;
public class J04018 {
    static class SoPhuc{
        private int x,y;
        public SoPhuc(int x, int y){
            this.x = x;
            this.y = y;
        }
        public SoPhuc add(SoPhuc other){
            int X = this.x + other.x;
            int Y = this.y + other.y;
            return new SoPhuc(X, Y);
        }
        public SoPhuc mul(SoPhuc other){
            int X = this.x * other.x - this.y * other.y;
            int Y = this.x * other.y + this.y * other.x;
            return new SoPhuc(X, Y);
        }
        @Override
        public String toString(){
            if (this.y > 0)
                return String.format("%d + %di", this.x, this.y);
            else 
                return String.format("%d - %di", this.x, -this.y);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            SoPhuc A = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc B = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc C = (A.add(B)).mul(A);
            SoPhuc D = (A.add(B)).mul(A.add(B));
            System.out.println(C + ", " + D);
        }
    }
}
