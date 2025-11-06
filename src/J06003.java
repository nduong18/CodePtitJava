import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J06003 {
    static class SinhVien{
        private String msv, hoTen, sdt;
        private int nhom;

        public SinhVien(String msv, String hoTen, String sdt, int nhom){
            this.msv = msv;
            this.hoTen = hoTen;
            this.sdt = sdt;
            this.nhom = nhom;
        }

        @Override
        public String toString(){
            return String.format("%s %s %s", this.msv, this.hoTen, this.sdt);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SinhVien> list = new ArrayList<>();

        String[] tmp = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(tmp[0]);
        int m = Integer.parseInt(tmp[1]);

        for (int i = 0; i < n ;i++){
            String msv = sc.nextLine().trim();
            String hoTen = sc.nextLine().trim();
            String sdt = sc.nextLine().trim();
            int nhom = Integer.parseInt(sc.nextLine());
            list.add(new SinhVien(msv, hoTen, sdt, nhom));
        }

        String[] btl = new String[m];
        for (int i = 0; i < m; i++){
            btl[i] = sc.nextLine();
        }

        int q = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < q; i++){
            int z = Integer.parseInt(sc.nextLine());
            System.out.printf("DANH SACH NHOM %d:\n", z);
            for (SinhVien sv : list){
                if (sv.nhom == z){
                    System.out.println(sv);
                }
            }
            System.out.printf("Bai tap dang ky: %s\n", btl[z-1]);
        }
    }
}
