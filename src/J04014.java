import java.util.Scanner;

public class J04014 {
    static class PhanSo{
        private long tu, mau;
        public PhanSo(long tu, long mau){
            this.tu = tu;
            this.mau = mau;
            rutGon();
        }
        private void rutGon(){
            long ucln = gcd(this.tu, this.mau);
            this.tu /= ucln;
            this.mau /= ucln;
            if (this.mau < 0){
                this.tu = -this.tu;
                this.mau = -this.mau;
            }
        }
        public PhanSo add(PhanSo other){
            long t = this.tu * other.mau + this.mau * other.tu;
            long m = this.mau * other.mau;
            return new PhanSo(t, m);
        }

        public PhanSo mu2(){
            long t = this.tu * this.tu;
            long m = this.mau * this.mau;
            return new PhanSo(t, m);
        }
        public PhanSo mul(PhanSo other){
            long t = this.tu * other.tu;
            long m = this.mau * other.mau;
            return new PhanSo(t, m);
        }
        @Override
        public String toString(){
            return String.format("%d/%d",tu,mau);
        }
    }

    static long gcd(long a, long b){
        return b == 0 ? a : gcd(b , a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t-- > 0){
            long tu1 = sc.nextLong();
            long mau1 = sc.nextLong();
            long tu2 = sc.nextLong();
            long mau2 = sc.nextLong();

            PhanSo A = new PhanSo(tu1, mau1);
            PhanSo B = new PhanSo(tu2, mau2);
            PhanSo C = A.add(B).mu2();
            PhanSo D = (A.mul(B)).mul(C);
            System.out.println(C + " " + D);
        }

    }
}

