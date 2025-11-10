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
            String s = sc.nextLine().trim();
            String tmp = "";
            switch (s){
                case "Ke toan":
                    tmp = "KT";
                    break;
                case "Cong nghe thong tin":
                    tmp = "CN";
                    break;
                case "An toan thong tin":
                    tmp = "AT";
                    break;
                case "Vien thong":
                    tmp = "VT";
                    break;
                case "Dien tu":
                    tmp = "DT";
                    break;
                default:
                    break;
            }
            System.out.println("DANH SACH SINH VIEN NGANH " + s.toUpperCase() + ":");
            for (SinhVien sv : list) {
                if (tmp.equals(sv.msv.substring(5,7)) ){
                    if ((tmp.equals("CN") || tmp.equals("AT")) && sv.lop.charAt(0) == 'E') continue;
                    System.out.println(sv);
                }
            }
        }
    }
}
