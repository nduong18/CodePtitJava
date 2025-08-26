import java.util.Scanner;

public class J04003 {
    static long GCD(long a, long b){
        if (b == 0) return a;
        return GCD(b, a % b);
    }
    public static class PhanSo{
        private long tu;
        private long mau;
        public PhanSo(long tu, long mau){
            this.tu = tu;
            this.mau = mau;
        }
        public String rutGonPhanSo(){
            long x = GCD(this.tu, this.mau);
            this.tu /= x;
            this.mau /= x;
            return this.tu + "/" + this.mau;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu = sc.nextLong();
        long mau = sc.nextLong();
        PhanSo p = new PhanSo(tu,mau);
        System.out.println(p.rutGonPhanSo());
    }
}
