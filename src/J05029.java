import java.util.*;

public class J05029 {
    static class DoanhNghiep{
        private String ma, ten;
        private int sv;
        private DoanhNghiep(String ma, String ten, int sv){
            this.ma = ma;
            this.ten = ten;
            this.sv = sv;
        }

        @Override
        public String toString(){
            return String.format("%s %s %d", this.ma, this.ten, this.sv);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<DoanhNghiep> list = new ArrayList<>();
        while (t-- > 0){
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            int sv = Integer.parseInt(sc.nextLine());
            DoanhNghiep dn = new DoanhNghiep(ma, ten, sv);
            list.add(dn);
        }
        list.sort((a, b) -> {
            int cmp = Integer.compare(b.sv, a.sv);
            if (cmp != 0) return cmp;
            return a.ma.compareTo(b.ma);
        });

        int z = Integer.parseInt(sc.nextLine());
        while (z-- > 0){
            String[] tmp = sc.nextLine().trim().split("\\s+");
            int x = Integer.parseInt(tmp[0]);
            int y = Integer.parseInt(tmp[1]);

            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n", x, y);
            for (DoanhNghiep dn : list) {
                if (dn.sv >= x && dn.sv <= y){
                    System.out.println(dn);
                }
            }

        }
    }
}
