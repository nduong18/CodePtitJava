import java.util.*;

public class J05035 {
    static class SinhVien{
        private String msv, ten, lop, email, dn;
        private int stt;
        public SinhVien(String msv, String ten, String lop, String email, String dn, int stt){
            this.msv = msv;
            this.ten = ten;
            this.lop = lop;
            this.email = email;
            this.dn = dn;
            this.stt = stt;
        }
        @Override
        public String toString(){
            return String.format("%d %s %s %s %s %s", stt, msv, ten, lop, email, dn);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            list.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), i));
        }
        list.sort((a, b) -> {
            return a.msv.compareTo(b.msv);
        });

        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0){
            String s = sc.nextLine();
            for (SinhVien sv : list){
                if (sv.dn.equals(s)) System.out.println(sv);
            }
        }
    }
}
