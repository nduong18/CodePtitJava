import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J07056 {
    static class TienDien{
        private final String ten;
        private final String stt;
        private final int tienPhaiNop, thueVAT;
        private int tien1, tien2;
        public TienDien(String ten, String loai, int soDau, int soCuoi, int stt){
            String[] names = ten.toLowerCase().trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (String name : names)
                sb.append(Character.toUpperCase(name.charAt(0))).append(name.substring(1)).append(" ");
            this.ten = sb.toString().trim();

            this.stt = String.format("KH%02d", stt);

            int soDien = soCuoi - soDau;
            int dinhMuc;
            if (loai.charAt(0) == 'A') dinhMuc = 100;
            else if (loai.charAt(0) == 'B') dinhMuc = 500;
            else dinhMuc = 200;
            if (soDien < dinhMuc) {
                tien1 = soDien * 450;
            }
            else if (soDien > dinhMuc) {
                tien1 = dinhMuc * 450;
                tien2 = (soDien - dinhMuc) * 1000;
            }
            thueVAT = tien2 * 5 / 100;
            this.tienPhaiNop = tien1 + tien2 + thueVAT;
        }
        void showInfo(){
            System.out.printf("%s %s %d %d %d %d\n", this.stt, this.ten, this.tien1, this.tien2, this.thueVAT, this.tienPhaiNop);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<TienDien> arr = new ArrayList<>();
        for (int i = 1; i <= t; i++){
           String ten = sc.nextLine();
           String[] x = sc.nextLine().trim().split("\\s+");
           String loai = x[0];
           int soDau = Integer.parseInt(x[1]);
           int soCuoi = Integer.parseInt(x[2]);
           arr.add(new TienDien(ten, loai, soDau, soCuoi, i));
        }
        arr.sort(Comparator.comparing((TienDien a) -> a.tienPhaiNop).reversed());
        for (TienDien td : arr) td.showInfo();
    }
}
