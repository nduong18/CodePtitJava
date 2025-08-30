import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07054 {
    static class SinhVien{
        final private String ten;
        final private double diem1, diem2, diem3;
        final private int stt;
        public double diemTB;
        public SinhVien(String ten, double diem1, double diem2, double diem3, int stt){
            this.ten = ten;
            this.diem1 = diem1;
            this.diem2 = diem2;
            this.diem3 = diem3;
            this.stt = stt;
            diemTB = diemTB();
        }
        String STT(){
            return String.format("SV%02d", this.stt);
        }
        double diemTB(){
            return (this.diem1 + this.diem2 + this.diem3) / 3;
        }
        String chuanHoaTen(){
            String[] names = this.ten.toLowerCase().trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (String name : names){
                sb.append(Character.toUpperCase(name.charAt(0))).append(name.substring(1)).append(" ");
            }
            return sb.toString().trim();
        }
        void showInfo(){
            System.out.printf("%s %s %.2f ", STT(), chuanHoaTen(), this.diemTB);
        }
    }
    public static void main(String[] args) {
        try {
            File file = new File("BANGDIEM.in");
            Scanner sc = new Scanner(file);
            int t = Integer.parseInt(sc.nextLine());
            ArrayList<SinhVien> arr = new ArrayList<>();
            for (int stt = 1; stt <= t; stt++){
                arr.add(new SinhVien(sc.nextLine(),
                        Double.parseDouble(sc.nextLine()),
                        Double.parseDouble(sc.nextLine()),
                        Double.parseDouble(sc.nextLine()),
                        stt));
            }
            int top = 1;
            for (SinhVien sv : arr){
                sv.showInfo();
                System.out.printf("%d\n", top);
            }
        } catch (FileNotFoundException e){
            System.out.println();
        }
    }
}
