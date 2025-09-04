import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class J07053 {
    static class XetTuyen{
        private final String ten, ngaySinh;
        private final double diem1, diem2;
        private final String stt;
        private final String xepLoai;
        private final long diemTB;
        public XetTuyen(String ten, String ngaySinh, double diem1, double diem2, int stt){
            this.ngaySinh = ngaySinh;
            this.diem1 = diem1;
            this.diem2 = diem2;
            this.stt = String.format("PH%02d", stt);

            String[] names = ten.toLowerCase().trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (String name : names)
                sb.append(Character.toUpperCase(name.charAt(0))).append(name.substring(1)).append(" ");
            this.ten = sb.toString().trim();

            double diemThuong = 0;
            if (diem1 >= 8 && diem2 >= 8) diemThuong += 1;
            else if (diem1 > 7.5 && diem2 >= 7.5) diemThuong += 0.5;
            long diemTb = Math.round(((diem1 + diem2) / 2) + diemThuong);
            if (diemTb > 10) this.diemTB = 10;
            else this.diemTB = diemTb;

            if (this.diemTB >= 9) this.xepLoai = "Xuat sac";
            else if (this.diemTB == 8) this.xepLoai = "Gioi";
            else if (this.diemTB == 7) this.xepLoai = "Kha";
            else if (this.diemTB >= 5) this.xepLoai = "Trung binh";
            else this.xepLoai = "Truot";
        }
        void showInfo(){
            String[] tuoiArr = this.ngaySinh.trim().split("/");
            int tuoi = 2021 - Integer.parseInt(tuoiArr[2]);
            System.out.printf(Locale.US, "%s %s %d %d %s\n", this.stt, this.ten, tuoi, this.diemTB, this.xepLoai);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        sc.useLocale(Locale.US);
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= t; i++){
            String ten = sc.nextLine();
            String ngaySinh = sc.nextLine();
            double diem1 = Double.parseDouble(sc.nextLine());
            double diem2 = Double.parseDouble(sc.nextLine());
            XetTuyen xt = new XetTuyen(ten, ngaySinh, diem1, diem2, i);
            xt.showInfo();
        }
    }
}
