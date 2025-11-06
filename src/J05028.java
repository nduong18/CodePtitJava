import java.util.*;

public class J05028 {
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
        for (DoanhNghiep dn : list) System.out.println(dn);
    }
}
