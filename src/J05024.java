import java.util.*;

public class J05024 {
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
            String s = sc.nextLine().trim().toUpperCase();
            String tmp = "";
            switch (s){
                case "KE TOAN":
                    tmp = "KT";
                    break;
                case "CONG NGHE THONG TIN":
                    tmp = "CN";
                    break;
                case "AN TOAN THONG TIN":
                    tmp = "AT";
                    break;
                case "VIEN THONG":
                    tmp = "VT";
                    break;
                case "DIEN TU":
                    tmp = "DT";
                    break;
                default:
                    break;
            }
            System.out.println("DANH SACH SINH VIEN NGANH " + s + ":");
            for (SinhVien sv : list) {
                if (tmp.equals(sv.msv.substring(5,7))){
                    System.out.println(sv);
                }
            }
        }
    }
}
