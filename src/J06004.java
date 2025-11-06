import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J06004 {
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
            return String.format("%s %s %s %d", this.msv, this.hoTen, this.sdt, this.nhom);
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

        list.sort((a, b) -> {
            return a.msv.compareTo(b.msv);
        });

        for (SinhVien sv : list){
            System.out.print(sv + " " + btl[sv.nhom - 1] + "\n");
        }
    }
}
