import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J05023 {
    static class SinhVien{
        private String msv, hoTen, lop, email;
        public SinhVien(String msv, String hoTen, String lop, String email){
            this.msv = msv;
            this.hoTen = hoTen;
            this.lop = lop;
            this.email = email;
        }

        @Override
        public String toString(){
            return String.format("%s %s %s %s", this.msv, this.hoTen, this.lop, this.email);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<>();
        while (t-- > 0){
            SinhVien sv = new SinhVien(sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim());
            list.add(sv);
        }
        int z = Integer.parseInt(sc.nextLine());
        while (z-- > 0){
            String s = sc.nextLine().trim();
            System.out.println("DANH SACH SINH VIEN KHOA " + s + ":");
            for (SinhVien sv : list) {
                String tmp = sv.lop.substring(1,3);
                if (tmp.equals(s.substring(2))){
                    System.out.println(sv);
                }
            }
        }
    }
}
