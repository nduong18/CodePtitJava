import java.util.Locale;
import java.util.Scanner;

public class J04013 {
    public static class ThiSinh{
        private final String ma, ten;
        private final double diemToan, diemLy, diemHoa, diemUuTien;
        private final String trangThai;
        public ThiSinh(String ma, String ten, double diemToan, double diemLy, double diemHoa){
            this.ma = ma;
            this.ten = ten;
            this.diemToan = diemToan;
            this.diemLy = diemLy;
            this.diemHoa = diemHoa;

            char c = this.ma.charAt(2);
            if (c == '1') this.diemUuTien = 0.5;
            else if (c == '2') this.diemUuTien = 1.0;
            else this.diemUuTien = 2.5;

            if (tongDiem() + this.diemUuTien < 24) this.trangThai = "TRUOT";
            else this.trangThai = "TRUNG TUYEN";
        }
        double tongDiem(){
            return this.diemToan*2 + this.diemLy + this.diemHoa;
        }
        String formatDouble(double x){
            if (x == (long)x) return String.valueOf((long)x);
            return String.format(Locale.US, "%.1f", x);
        }
        void showInfo(){
            System.out.printf("%s %s %s %s %s", this.ma, this.ten, formatDouble(diemUuTien), formatDouble(this.tongDiem()), this.trangThai);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String ma = sc.nextLine();
        String ten = sc.nextLine();
        double diemToan = sc.nextDouble();
        double diemLy = sc.nextDouble();
        double diemHoa = sc.nextDouble();
        ThiSinh ts = new ThiSinh(ma, ten, diemToan, diemLy, diemHoa);
        ts.showInfo();
    }
}
