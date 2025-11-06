import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J05022 {
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
            System.out.println("DANH SACH SINH VIEN LOP " + s + ":");
            for (SinhVien sv : list) {
                if (sv.lop.equals(s)){
                    System.out.println(sv);
                }
            }
        }
    }
}
