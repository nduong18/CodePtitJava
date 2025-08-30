import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J07046 {
    static class Khach{
        final private String tenKH, maPhong, ngayDen, ngayDi;
        public long days;
        final private int maKH;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        public Khach(String tenKH, String maPhong, String ngayDen, String ngayDi, int maKH){
            this.tenKH = tenKH;
            this.maPhong = maPhong;
            this.ngayDen = ngayDen;
            this.ngayDi = ngayDi;
            if (this.ngayDen.equals(this.ngayDi)) this.days = 0;
            else{
                LocalDate d1 = LocalDate.parse(this.ngayDen, fmt);
                LocalDate d2 = LocalDate.parse(this.ngayDi, fmt);
                this.days = ChronoUnit.DAYS.between(d1, d2);
            }
            this.maKH = maKH;
        }

        String maKH(){
            return String.format("KH%02d", this.maKH);
        }

        void showInfo(){
            System.out.printf("%s %s %s %d\n", maKH(), this.tenKH, this.maPhong, this.days);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Khach> arr = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            arr.add(new Khach(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), i));
        }
        arr.sort(Comparator.comparing(a -> -a.days));
        for (Khach k : arr) k.showInfo();
    }
}
