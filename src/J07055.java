import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class J07055 {
    static class XepLoai{
        private final String ten;
        private final double diem1, diem2, diem3;
        private final double diemTongKet;
        private final String xepLoai;
        private final String stt;
        public XepLoai(String ten, double diem1, double diem2, double diem3, int stt){
            this.diem1 = diem1;
            this.diem2 = diem2;
            this.diem3 = diem3;
            this.diemTongKet = 0.25 * diem1 + 0.35 * diem2 + 0.4 * diem3;

            String[] names = ten.toLowerCase().trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (String name : names)
                sb.append(Character.toUpperCase(name.charAt(0))).append(name.substring(1)).append(" ");
            this.ten = sb.toString().trim();
            this.stt = String.format("SV%02d", stt);
            if (this.diemTongKet >= 8) this.xepLoai = "GIOI";
            else if (this.diemTongKet >= 6.5) this.xepLoai = "KHA";
            else if (this.diemTongKet >= 5) this.xepLoai = "TRUNG BINH";
            else this.xepLoai = "KEM";
        }

        void showInfo(){
            System.out.printf(Locale.US,"%s %s %.2f %s\n", this.stt, this.ten, this.diemTongKet, this.xepLoai);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<XepLoai> arr = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            arr.add(new XepLoai(sc.nextLine(),
                    Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()), i));
        }
        arr.sort(Comparator.comparing((XepLoai a) -> a.diemTongKet).reversed());
        for (XepLoai x : arr) x.showInfo();
    }
}
