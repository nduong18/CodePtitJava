import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J07051 {
    static class KhachHang{
        final private String tenKH, soPhong, ngayNhanPhong, ngayTraPhong, stt;
        final private long tienDV;
        public long days;
        public long tongTien;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        public KhachHang(String tenKH, String soPhong, String ngayNhanPhong, String ngayTraPhong, long tienDV, int stt){
            this.soPhong = soPhong;
            this.ngayNhanPhong = chuanHoaNgayThang(ngayNhanPhong);
            this.ngayTraPhong = chuanHoaNgayThang(ngayTraPhong);
            this.tienDV = tienDV;
            this.stt = String.format("KH%02d",stt);

            LocalDate d1 = LocalDate.parse(this.ngayNhanPhong, fmt);
            LocalDate d2 = LocalDate.parse(this.ngayTraPhong, fmt);
            this.days = ChronoUnit.DAYS.between(d1, d2) + 1;

            String[] names = tenKH.toLowerCase().trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (String name : names) sb.append(Character.toUpperCase(name.charAt(0))).append(name.substring(1)).append(" ");
            this.tenKH = sb.toString().trim();

            this.tongTien = tinhTongTien();
        }

        long tinhTongTien(){
            char c = this.soPhong.charAt(0);
            if (c == '1') return 25 * this.days + this.tienDV;
            if (c == '2') return 34 * this.days + this.tienDV;
            if (c == '3') return 50 * this.days + this.tienDV;
            return 80 * this.days + this.tienDV;
        }

        String chuanHoaNgayThang(String s){
            String[] words = s.trim().split("/");
            if (words[0].length() == 1) words[0] = "0" + words[0];
            if (words[1].length() == 1) words[1] = "0" + words[1];
            return words[0] + "/" + words[1] + "/" + words[2];
        }

        void showInfo(){
            System.out.printf("%s %s %s %d %d\n", this.stt, this.tenKH, this.soPhong, this.days, this.tongTien);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> arr = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            arr.add(new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), i));
        }
        arr.sort(Comparator.comparing(a -> -a.tongTien));
        for (KhachHang k : arr) k.showInfo();
    }
}
