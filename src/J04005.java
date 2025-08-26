import java.util.Locale;
import java.util.Scanner;

public class J04005 {
    static class ThiSinh{
        final private String name, date;
        final private double diem1, diem2, diem3;
        public ThiSinh(String name, String date, double diem1, double diem2, double diem3){
            this.name = name;
            this.date = date;
            this.diem1 = diem1;
            this.diem2 = diem2;
            this.diem3 = diem3;
        }
        public double tongDiem(){
            return this.diem1 + this.diem2 + this.diem3;
        }
        public String chuanHoaDate(){
            String[] words = this.date.trim().split("/");
            if (words[0].length() == 1) words[0] = "0" + words[0];
            if (words[1].length() == 1) words[1] = "0" + words[1];
            return words[0] + "/" + words[1] + "/" + words[2];
        }

        public void showInfo(){
            System.out.printf(Locale.US,"%s %s %.1f",this.name, chuanHoaDate(), tongDiem());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String name = sc.nextLine(), date = sc.nextLine();
        double diem1 = sc.nextDouble(), diem2 = sc.nextDouble(), diem3 = sc.nextDouble();
        ThiSinh ts = new ThiSinh(name,date,diem1,diem2,diem3);
        ts.showInfo();
    }
}
