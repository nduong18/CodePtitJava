import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07057 {
    static class ThiSinh{
        final private String ten;
        final private double diemThi;
        final private String danToc;
        final private int khuVuc;
        final private int stt;
        public double tongDiem = 0;
        public ThiSinh(String ten, double diemThi, String danToc, int khuVuc, int stt){
            this.ten = ten;
            this.diemThi = diemThi;
            this.danToc = danToc;
            this.khuVuc = khuVuc;
            this.stt = stt;
            tongDiem = tongDiem();
        }
        String chuanHoaTen(){
            String[] names = this.ten.toLowerCase().trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (String name : names){
                sb.append(Character.toUpperCase(name.charAt(0))).append(name.substring(1)).append(" ");
            }
            return sb.toString().trim();
        }
        String STT(){
            return String.format("TS%02d",this.stt);
        }
        double tongDiem(){
            double diemUuTien = 0;
            if (this.khuVuc == 1) diemUuTien += 1.5;
            if (this.khuVuc == 2) diemUuTien += 1;
            if (this.khuVuc == 3) diemUuTien += 0;
            if (this.danToc.equals("Kinh")) diemUuTien += 0;
            else diemUuTien += 1.5;
            return this.diemThi + diemUuTien;
        }
        String tinhTrang(){
            if (tongDiem() < 20.5) return "Truot";
            return "Do";
        }
        void showInfo(){
            System.out.printf(Locale.US, "%s %s %.1f %s\n", STT(), chuanHoaTen(), tongDiem(), tinhTrang());
        }

    }
    public static void main(String[] args) {
        try{
            File file = new File("THISINH.in");
            Scanner sc = new Scanner(file);
            sc.useLocale(Locale.US);
            int t = sc.nextInt();
            sc.nextLine();
            ArrayList<ThiSinh> arr = new ArrayList<>();
            for (int i = 1; i <= t; i++){
                String ten = sc.nextLine();
                double diemThi = Double.parseDouble(sc.nextLine());
                String danToc = sc.nextLine();
                int khuVuc = Integer.parseInt(sc.nextLine());
                ThiSinh ts = new ThiSinh(ten, diemThi, danToc, khuVuc, i);
                arr.add(ts);
            }
            arr.sort(Comparator.comparing((ThiSinh a) -> a.tongDiem).reversed().thenComparing((ThiSinh a) -> a.stt));
            for (ThiSinh x : arr){
                x.showInfo();
            }
        } catch (FileNotFoundException e){
            System.out.println();
        }

    }
}
