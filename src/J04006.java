import java.util.Locale;
import java.util.Scanner;

public class J04006 {
    static class SinhVien {
        final private String name, lop, date;
        final private double gpa;
        public SinhVien(String name, String lop, String date, double gpa){
            this.name = name;
            this.date = date;
            this.lop = lop;
            this.gpa = gpa;
        }
        public String chuanHoaDate(){
            String[] words = this.date.trim().split("/");
            if (words[0].length() == 1) words[0] = "0" + words[0];
            if (words[1].length() == 1) words[1] = "0" + words[1];
            return words[0] + "/" + words[1] + "/" + words[2];
        }

        public void showInfo(){
            System.out.printf(Locale.US,"B20DCCN001 %s %s %s %.2f", this.name, this.lop, chuanHoaDate(), this.gpa);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String name = sc.nextLine(), lop = sc.nextLine(), date = sc.nextLine();
        double gpa = sc.nextDouble();
        SinhVien sv = new SinhVien(name, lop, date, gpa);
        sv.showInfo();
    }
}
