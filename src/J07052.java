import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class J07052 {
    static class ThiSinh{
        private final String ma, ten;
        private final double diem1, diem2, diem3;
        public double tongDiem;
        private final double diemUuTien;
        public String trangThai;

        public ThiSinh(String ma, String ten, double diem1, double diem2, double diem3){
            this.ma = ma;
            this.diem1 = diem1;
            this.diem2 = diem2;
            this.diem3 = diem3;
            this.tongDiem = diem1 * 2 + diem2 + diem3;

            char c = ma.charAt(2);
            if (c == '1') this.diemUuTien = 0.5;
            else if (c == '2') this.diemUuTien = 1.0;
            else this.diemUuTien = 2.5;
            this.tongDiem += this.diemUuTien;

            String[] names = ten.toLowerCase().trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (String name : names) sb.append(Character.toUpperCase(name.charAt(0))).append(name.substring(1)).append(" ");
            this.ten = sb.toString().trim();
        }

        public void setTrangThai(String trangThai) {
            this.trangThai = trangThai;
        }

        String formatDouble(double x) {
            if (x == (long) x) {
                return String.format(Locale.US, "%.0f", x); // in số nguyên
            } else {
                return String.format(Locale.US, "%.1f", x); // in 1 chữ số thập phân
            }
        }

        void showInfo(){
            System.out.printf(Locale.US ,"%s %s %s %s %s\n", this.ma, this.ten, formatDouble(this.diemUuTien), formatDouble(this.tongDiem), this.trangThai);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        sc.useLocale(Locale.US);
        ArrayList<ThiSinh> arr = new ArrayList<>();

        int t = sc.nextInt(); sc.nextLine();
        while (t-- > 0){
            arr.add(new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
            sc.nextLine();
        }

        int chiTieu = Integer.parseInt(sc.nextLine());
        arr.sort(Comparator.comparing((ThiSinh a) -> a.tongDiem).reversed().thenComparing((ThiSinh a) -> a.ma));

        double diemChuan = 0;
        int cnt = 1;
        for (ThiSinh ts : arr) {
            if (cnt <= chiTieu) {
                diemChuan = ts.tongDiem;
                ts.setTrangThai("TRUNG TUYEN");
            }
            else if (ts.tongDiem == diemChuan) {
                ts.setTrangThai("TRUNG TUYEN");
            }
            else ts.setTrangThai("TRUOT");
            cnt++;
        }

        System.out.printf(Locale.US,"%.1f\n", diemChuan);
        for (ThiSinh ts : arr) ts.showInfo();
    }
}
