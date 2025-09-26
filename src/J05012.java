import java.util.*;
public class J05012 {
    static class MatHang{
        private String ms, ten;
        private long sl, donGia, ck, thanhTien;
        public MatHang(String ms, String ten, long sl, long donGia, long ck){
            this.ms = ms.trim();
            this.ten = ten.trim();
            this.sl = sl;
            this.donGia = donGia;
            this.ck = ck;
            thanhTien = donGia * sl - ck;
        }
        
        @Override
        public String toString(){
            return String.format("%s %s %d %d %d %d", this.ms, this.ten, this.sl, this.donGia, this.ck, this.thanhTien);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<MatHang> list = new ArrayList<>();
        while (t-->0){
            String ms = sc.nextLine();
            String ten = sc.nextLine();
            long sl = Long.parseLong(sc.nextLine());
            long donGia = Long.parseLong(sc.nextLine());
            long ck = Long.parseLong(sc.nextLine());
            MatHang mh = new MatHang(ms, ten, sl, donGia, ck);
            list.add(mh);
        }
        list.sort((a, b) -> Long.compare(b.thanhTien, a.thanhTien));
        for (MatHang mh : list) System.out.println(mh);
    }
}
