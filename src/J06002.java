import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J06002 {
    static class SanPham{
        String ma, ten;
        long giaLoai1, giaLoai2;
        public SanPham(String ma, String ten, long giaLoai1, long giaLoai2){
            this.ma = ma;
            this.ten = ten;
            this.giaLoai1 = giaLoai1;
            this.giaLoai2 = giaLoai2;
        }
    }

    static class HoaDon{
        String ma, ten;
        long giamGia, phaiTra;

        public HoaDon(String ma, String ten, long giamGia, long phaiTra){
            this.ma = ma;
            this.ten = ten;
            this.giamGia = giamGia;
            this.phaiTra = phaiTra;
        }

        @Override
        public String toString(){
            return String.format("%s %s %d %d", this.ma, this.ten, this.giamGia, this.phaiTra);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<SanPham> DSSP = new ArrayList<>();
        while (t-- > 0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            long giaLoai1 = Long.parseLong(sc.nextLine());
            long giaLoai2 = Long.parseLong(sc.nextLine());
            DSSP.add(new SanPham(ma, ten, giaLoai1, giaLoai2));
        }

        int z = Integer.parseInt(sc.nextLine());
        List<HoaDon> DSHD = new ArrayList<>();
        for (int i = 1; i <= z; i++){
            String[] tmp = sc.nextLine().trim().split("\\s+");
            String maHoaDon = tmp[0].substring(0,2);
            int loai = Integer.parseInt(tmp[0].substring(2));
            long soLuong = Long.parseLong(tmp[1]);

            for (SanPham sp : DSSP){
                if (sp.ma.equals(maHoaDon)){
                    long giamGia = 0, donGia;

                    if (loai == 1) donGia = sp.giaLoai1;
                    else donGia = sp.giaLoai2;

                    if (soLuong >= 150) giamGia = soLuong * donGia * 50 / 100;
                    else if (soLuong >= 100) giamGia = soLuong * donGia * 30 / 100;
                    else if (soLuong >= 50) giamGia = soLuong * donGia * 15 / 100;

                    long phaiTra = soLuong * donGia - giamGia;

                    maHoaDon = String.format("%s%d-%03d", maHoaDon, loai, i);
                    DSHD.add(new HoaDon(maHoaDon, sp.ten, giamGia, phaiTra));
                }
            }
        }
        DSHD.sort((a, b) -> {
            return Long.compare(b.phaiTra, a.phaiTra);
        });
        for (HoaDon hd : DSHD){
            System.out.println(hd);
        }
    }
}
