import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J07048 {
    static class SanPham{
        final private String maSP, tenSP;
        final private int giaBan, thoiHBH;
        public SanPham(String maSP, String tenSP, int giaBan, int thoiHBH){
            this.maSP = maSP;
            this.tenSP = tenSP;
            this.giaBan = giaBan;
            this.thoiHBH = thoiHBH;
        }
        void showInfo(){
            System.out.printf("%s %s %d %d\n", this.maSP, this.tenSP, this.giaBan, this.thoiHBH);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> arr = new ArrayList<>();
        while (t-->0){
            arr.add(new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        arr.sort(Comparator.comparing((SanPham a) -> a.giaBan).reversed().thenComparing((SanPham a) -> a.maSP));
        for (SanPham s : arr) s.showInfo();
    }
}
