import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J05031 {
    static class SinhVien{
        private String msv, ten, lop;
        private double diem1, diem2, diem3;
        public SinhVien(String msv, String ten, String lop, double diem1, double diem2, double diem3){
            this.msv = msv;
            this.ten = ten;
            this.lop = lop;
            this.diem1 = diem1;
            this.diem2 = diem2;
            this.diem3 = diem3;
        }
        @Override
        public String toString(){
            return String.format("%s %s %s %.1f %.1f %.1f", msv, ten, lop, diem1, diem2, diem3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> DSSV = new ArrayList<>();
        while (t-- > 0){
            DSSV.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        DSSV.sort((a, b) ->{
            return a.ten.compareTo(b.ten);
        });
        int index = 1;
        for (SinhVien sv : DSSV) {
            System.out.println(index + " " + sv);
            index++;
        }
    }
}
