import java.util.*;
public class J05004 {
    static class SinhVien{
        private String ten, lop, ns, msv;
        private double gpa;
        
        public SinhVien(){
            this.msv = this.ten = this.lop = this.ns = "";
            this.gpa = 0.0;
        }
                
        public SinhVien(String ten, String lop, String ns, double gpa, int stt){
            this.lop = lop;
            this.gpa = gpa;
            
            String[] date = ns.trim().split("/");
            this.ns = String.format("%02d/%02d/%04d", Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
            this.msv = String.format("B20DCCN%03d", stt);
            
            String[] names = ten.trim().toLowerCase().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (String s : names) sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
            this.ten = sb.toString().trim();
        }
        
        @Override
        public String toString(){
            return String.format(Locale.US, "%s %s %s %s %.2f", this.msv, this.ten, this.lop, this.ns, this.gpa);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++){
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String ns = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            SinhVien sv = new SinhVien(ten, lop, ns, gpa, i);
            System.out.println(sv);
        }
    }
}
