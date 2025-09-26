import java.util.*;
public class J05018 {
    static class HocSinh{
        private String ms, ten, hocLuc;
        private double dtb;
        public HocSinh(int ms, String ten, double dtb){
            this.ms = String.format("HS%02d", ms);
            this.ten = ten;
            this.dtb = Math.round(dtb / 12 * 10) / 10.0;
            
            if (this.dtb >= 9) hocLuc = "XUAT SAC";
            else if (this.dtb >= 8) hocLuc = "GIOI";
            else if (this.dtb >= 7) hocLuc = "KHA";
            else if (this.dtb >= 5) hocLuc = "TB";
            else hocLuc = "YEU";
        }
        @Override
        public String toString(){
            return String.format(Locale.US, "%s %s %.1f %s", this.ms, this.ten, this.dtb, this.hocLuc);
        }
        public double DTB(){
            return this.dtb;
        }
        public String MS(){
            return this.ms;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int t = Integer.parseInt(sc.nextLine());
        List<HocSinh> list = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            String ten = sc.nextLine();
            double tong = 0;
            String[] diems = sc.nextLine().split("\\s+");
            for (int j = 0; j < diems.length; j++){
                if (j <= 1) tong += 2*Double.parseDouble(diems[j]);
                else tong += Double.parseDouble(diems[j]);
            }
            HocSinh hs = new HocSinh(i, ten, tong);
            list.add(hs);
        }
        list.sort((a, b) -> {
            int cmp = Double.compare(b.DTB(), a.DTB());
            if (cmp != 0) return cmp;
            return a.MS().compareTo(b.MS());
        });
        for (HocSinh hs : list) System.out.println(hs);
    }
}
