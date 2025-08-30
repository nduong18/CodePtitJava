import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05081 {
    static class MatHang{
        final private String ten, donVi;
        final private long giaMua, giaBan;
        final private int stt;
        final private long tienLai;
        public MatHang(String ten, String donVi, long giaMua, long giaBan, int stt){
            this.ten = ten;
            this.donVi = donVi;
            this.giaMua = giaMua;
            this.giaBan = giaBan;
            this.stt = stt;
            tienLai = this.giaBan - this.giaMua;
        }
        String STT(){
            return String.format("MH%03d", this.stt);
        }
        void showInfo(){
            System.out.printf("%s %s %s %d %d %d\n", STT(), this.ten, this.donVi, this.giaMua, this.giaBan, this.tienLai);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> arr = new ArrayList<>();
        for (int stt = 1; stt <= t; stt++){
            arr.add(new MatHang(sc.nextLine(),
                    sc.nextLine(),
                    Long.parseLong(sc.nextLine()),
                    Long.parseLong(sc.nextLine()),
                    stt));
        }
        arr.sort(Comparator.comparing((MatHang a) -> a.tienLai).reversed());
        for (MatHang m : arr) m.showInfo();
    }
}
