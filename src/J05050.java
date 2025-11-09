import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J05050 {
    static class KhachHang{
        private String ma;
        private int heSo, thanhTien, phuTroi, tongTienPhaiTra;
        public KhachHang(int ma, String loai, int soCu, int soMoi){
            this.ma = String.format("KH%02d",ma);
            this.heSo = getHeSo(loai);
            this.thanhTien = getThanhTien(soCu, soMoi);
            this.phuTroi = getPhuTroi(soCu, soMoi);
            this.tongTienPhaiTra = getTongTien(this.thanhTien, this.phuTroi);
        }
        public int getHeSo(String loai){
            if (loai.equals("KD")) return 3;
            if (loai.equals("NN")) return 5;
            if (loai.equals("TT")) return 4;
            return 2;
        }
        public int getThanhTien(int soCu, int soMoi){
            return (soMoi - soCu) * heSo * 550;
        }
        public int getPhuTroi(int soCu, int soMoi){
            int tmp = soMoi - soCu;
            if (tmp < 50) return 0;
            if (tmp <= 100) return Math.round(this.thanhTien * ((float) 35 / 100));
            return getThanhTien(soCu, soMoi);
        }
        public int getTongTien(int thanhTien, int phuTroi){
            return thanhTien + phuTroi;
        }

        @Override
        public String toString(){
            return String.format("%s %d %d %d %d", this.ma, this.heSo, this.thanhTien, this.phuTroi, this.tongTienPhaiTra);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<KhachHang> list = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            list.add(new KhachHang(i, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        for (KhachHang kh : list) System.out.println(kh);
    }
}
