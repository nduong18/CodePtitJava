import java.util.*;
public class J05017 {
    static class KhachHang{
        private String ten, ms;
        private int tongTien;
        private float pp;
        public KhachHang(String ten, int cu, int moi, int stt){
            this.ten = ten;
            this.ms = String.format("KH%02d", stt);
            
            int z = moi - cu;
            int tong = 0;
            if (z > 100) {
                tong = 50 * 100 + 50 * 150 + Math.abs((z - 100)) * 200;
                pp = 0.05f;
            }
            else if (z >= 51 && z <= 100) {
                tong = 50 * 100 + Math.abs(z - 50) * 150;
                pp = 0.03f;
            }
            else {
                tong = z * 100;
                pp = 0.02f;                
            }
            
            tongTien = (int) Math.round(tong + (tong * pp));
        }
        @Override
        public String toString(){
            return String.format("%s %s %d", this.ms, this.ten, this.tongTien);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<KhachHang> list = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            KhachHang kh = new KhachHang(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), i);
            list.add(kh);
        }
        list.sort((a , b) -> Integer.compare(b.tongTien, a.tongTien));
        for (KhachHang kh : list) System.out.println(kh);
    }
}
