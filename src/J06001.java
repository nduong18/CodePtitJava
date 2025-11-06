import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J06001 {
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
        for (int i = 1; i <= z; i++){
            String[] tmp = sc.nextLine().trim().split("\\s+");
            String maHoaDon = tmp[0].substring(0,2);
            int loai = Integer.parseInt(tmp[0].substring(2));
            long soLuong = Long.parseLong(tmp[1]);

            for (SanPham sp : DSSP){
                if (sp.ma.equals(maHoaDon)){
                    long giamGia = 0, donGia = 0;

                    if (loai == 1) donGia = sp.giaLoai1;
                    else donGia = sp.giaLoai2;

                    if (soLuong >= 150) giamGia = soLuong * donGia * 50 / 100;
                    else if (soLuong >= 100) giamGia = soLuong * donGia * 30 / 100;
                    else if (soLuong >= 50) giamGia = soLuong * donGia * 15 / 100;

                    long phaiTra = soLuong * donGia - giamGia;

                    System.out.printf("%s%d-%03d %s %d %d\n", maHoaDon, loai, i, sp.ten, giamGia, phaiTra);
                }
            }
        }
    }
}
