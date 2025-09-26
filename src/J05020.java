import java.util.*;
public class J05020 {
    static class SinhVien{
        private String msv, ten, lop, email;
        public SinhVien(String msv, String ten, String lop, String email){
            this.msv = msv.trim();
            this.ten = ten.trim();
            this.lop = lop.trim();
            this.email = email.trim();
        }
        @Override
        public String toString(){
            return String.format("%s %s %s %s", msv, ten, lop, email);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList();
        while (t-->0){
            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(sv);
        }
        list.sort((a, b) ->{
            int cmp = a.lop.compareTo(b.lop);
            if (cmp != 0) return cmp;
            return a.msv.compareTo(b.msv);
        });
        for (SinhVien sv : list) System.out.println(sv);
    }
}
