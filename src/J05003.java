import java.util.*;
public class J05003 {
    static class SinhVien{
        private String ten, lop, ns, msv;
        private double gpa;
        public SinhVien(String ten, String lop, String ns, double gpa, int stt){
            this.ten = ten;
            this.lop = lop;
            this.gpa = gpa;            
            String[] date = ns.split("/");
            this.ns = String.format("%02d/%02d/%04d", Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
            this.msv = String.format("B20DCCN%03d", stt);
        }
        @Override
        public String toString(){
            return String.format("%s %s %s %s %.2f", this.msv, this.ten, this.lop, this.ns, this.gpa);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++){
            SinhVien sv = new SinhVien(sc.nextLine(),sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), i);
            System.out.println(sv);
        }
    }
}
