import java.util.*;
public class J05014 {
    static class GiaoVien{
        private String ten, ut, stt, tt, mon;
        private double diem;
        public GiaoVien(int stt, String ten, String ut, double diemTin, double diemChuyenMon){
            this.stt = String.format("GV%02d", stt);
            this.ten = ten;
            diem = diemTin * 2 + diemChuyenMon;
            
            if (ut.substring(0,1).equals("A")) mon = "TOAN";
            else if (ut.substring(0,1).equals("B")) mon = "LY";
            else mon = "HOA";
            
            if (ut.substring(1).equals("1")) diem += 2.0;
            else if (ut.substring(1).equals("2")) diem += 1.5;
            else if (ut.substring(1).equals("3")) diem += 1.0;
            
            if (diem >= 18) tt = "TRUNG TUYEN";
            else tt = "LOAI";
        }
        @Override
        public String toString(){
            return String.format("%s %s %s %.1f %s", this.stt, this.ten, this.mon, this.diem, this.tt);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<GiaoVien> list = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            String ten = sc.nextLine();
            String ut = sc.nextLine();
            double diemTin = Double.parseDouble(sc.nextLine());
            double diemChuyenMon = Double.parseDouble(sc.nextLine());
            GiaoVien gv = new GiaoVien(i, ten, ut, diemTin, diemChuyenMon);
            list.add(gv);
        }
        list.sort((a, b) -> Double.compare(b.diem, a.diem));
        for (GiaoVien gv : list) System.out.println(gv);
    }
}
