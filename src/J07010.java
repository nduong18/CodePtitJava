import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class J07010 {
    static class SinhVien{
        final private String ten, lop, ns;
        final private double gpa;
        final private int stt;
        public SinhVien(String ten, String lop, String ns, double gpa, int stt){
            this.ten = ten;
            this.lop = lop;
            this.ns = ns;
            this.gpa = gpa;
            this.stt = stt;
        }
        void showInfo(){
            String MSV = String.format("B20DCCN%03d",this.stt);

            String[] words = this.ns.trim().split("/");
            String NS = String.format("%02d/%02d/%04d",Integer.parseInt(words[0]),Integer.parseInt(words[1]),Integer.parseInt(words[2]));

            String[] names = this.ten.toLowerCase().trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (String name : names){
                sb.append(Character.toUpperCase(name.charAt(0))).append(name.substring(1).toLowerCase()).append(" ");
            }
            String NAME = sb.toString().trim();

            System.out.printf(Locale.US, "%s %s %s %s %.2f\n",MSV, NAME, this.lop, NS, this.gpa);
        }
    }
    public static void main(String[] args) {
        try {
            File file = new File("SV.in");
            Scanner sc = new Scanner(file);
            sc.useLocale(Locale.US);
            int t = sc.nextInt();
            sc.nextLine();
            for (int i = 1; i <= t; i++){
                String ten = sc.nextLine();
                String lop = sc.nextLine();
                String ns = sc.nextLine();
                double gpa = sc.nextDouble();
                sc.nextLine();
                SinhVien sv = new SinhVien(ten, lop, ns, gpa, i);
                sv.showInfo();
            }
        } catch (FileNotFoundException e){
            System.out.println();
        }
    }
}
