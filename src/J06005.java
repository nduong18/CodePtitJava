import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J06005 {
    static class KhachHang{
        private String ma, ten, gt, ns, dc;
        public KhachHang(String ma, String ten, String gt, String ns, String dc){
            this.ma = ma;
            this.ten = ten;
            this.gt = gt;
            this.ns = ns;
            this.dc = dc;
        }
    }
    static class MatHang{
        private String ma, ten, donVi;
        private long giaMua, giaBan;
        public MatHang(String ma, String ten, String donVi, long giaMua, long giaBan){
            this.ma = ma;
            this.ten = ten;
            this.donVi = donVi;
            this.giaMua = giaMua;
            this.giaBan = giaBan;
        }
    }
    static class HoaDon{
        private String ma;
        private KhachHang kh;
        private MatHang mh;
        private long soLuong, loiNhuan, thanhTien;

        public HoaDon(String ma, KhachHang kh, MatHang mh, long soLuong) {
            this.ma = ma;
            this.kh = kh;
            this.mh = mh;
            this.soLuong = soLuong;
            this.thanhTien = mh.giaBan * soLuong;
            this.loiNhuan = (mh.giaBan - mh.giaMua) * soLuong;
        }

        @Override
        public String toString(){
            return String.format("%s %s %s %s %s %d %d %d %d", this.ma, this.kh.ten, this.kh.dc, this.mh.ten, this.mh.donVi, this.mh.giaMua, this.mh.giaBan, this.soLuong, this.thanhTien);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<KhachHang> DSKH = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            DSKH.add(new KhachHang(String.format("KH%03d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int m = Integer.parseInt(sc.nextLine());
        List<MatHang> DSMH = new ArrayList<>();
        for (int i = 1; i <= m; i++){
            DSMH.add(new MatHang(String.format("MH%03d", i), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        int k = Integer.parseInt(sc.nextLine());
        List<HoaDon> DSHD = new ArrayList<>();
        for (int i = 1; i <= k; i++){
            String[] tmp = sc.nextLine().trim().split("\\s+");
            String x = tmp[0];
            String y = tmp[1];
            long soLuong = Long.parseLong(tmp[2]);

            KhachHang KH = null;
            MatHang MH = null;

            for (KhachHang kh : DSKH){
                if (x.equals(kh.ma)){
                    KH = kh;
                }
            }
            for (MatHang mh : DSMH){
                if (y.equals(mh.ma)){
                    MH = mh;
                }
            }

            DSHD.add(new HoaDon(String.format("HD%03d", i), KH, MH, soLuong));
        }
        for (HoaDon hd : DSHD) System.out.println(hd);
    }
}
