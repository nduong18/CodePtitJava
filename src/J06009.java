import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class J06009 {
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
        public HoaDon(int ma, KhachHang kh){
            this.ma = String.format("HD%03d", ma);
            this.kh = kh;
        }
    }
    public static void main(String[] args) {
        try{
            File fileKH = new File("KH.in");
            Scanner sc = new Scanner(fileKH);
            List<HoaDon> list = new ArrayList<>();
            int t = Integer.parseInt(sc.nextLine());
            while (t-- > 0){

            }
        }
        catch (FileNotFoundException e){
            return;
        }
    }
}
