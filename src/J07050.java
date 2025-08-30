import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class J07050 {
    static class MatHang{
        final private String tenHang, nhomHang;
        final private double giaMua, giaBan;
        final private int stt;
        public double loiNhuan;
        public MatHang(String tenHang, String nhomHang, double giaMua, double giaBan, int stt){
            this.tenHang = tenHang;
            this.nhomHang = nhomHang;
            this.giaMua = giaMua;
            this.giaBan = giaBan;
            this.stt = stt;
            this.loiNhuan = this.giaBan - this.giaMua;
        }

        String STT(){
            return String.format("MH%02d", this.stt);
        }

        void showInfo(){
            System.out.printf(Locale.US, "%s %s %s %.2f\n", STT(), this.tenHang, this.nhomHang, this.loiNhuan);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> arr = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            arr.add(new MatHang(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), i));
        }
        arr.sort(Comparator.comparing((MatHang a) -> a.loiNhuan).reversed());
        for (MatHang m : arr) m.showInfo();
    }
}
