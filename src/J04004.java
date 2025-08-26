import java.util.Scanner;

public class J04004 {
    static long GCD(long a, long b){
        if (b == 0) return a;
        return GCD(b, a % b);
    }
    static String tongHaiPhanSo(PhanSo p1, PhanSo p2){
        long mauChung = Math.abs(p1.mau * p2.mau) / GCD(p1.mau, p2.mau);
        long tongTu = p1.tu * (mauChung / p1.mau) + p2.tu * (mauChung / p2.mau);
        long res = GCD(tongTu,mauChung);
        tongTu /= res;
        mauChung /= res;
        return tongTu + "/" + mauChung;
    }
    public static class PhanSo{
        private long tu;
        private long mau;
        public PhanSo(long tu, long mau){
            this.tu = tu;
            this.mau = mau;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu1 = sc.nextLong();
        long mau1 = sc.nextLong();
        long tu2 = sc.nextLong();
        long mau2 = sc.nextLong();
        PhanSo p1 = new PhanSo(tu1,mau1);
        PhanSo p2 = new PhanSo(tu2,mau2);
        System.out.println(tongHaiPhanSo(p1,p2));
    }
}
