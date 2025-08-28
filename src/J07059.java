import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J07059 {
    static class CaThi{
        final private String ngayThi, gioThi;
        final private long ID;
        final private int stt;
        public LocalDate date;
        public LocalTime time;

        public CaThi(String ngayThi, String gioThi, long ID, int stt){
            this.ngayThi = ngayThi;
            this.gioThi = gioThi;
            this.ID = ID;
            this.stt = stt;

            DateTimeFormatter fDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            date = LocalDate.parse(this.ngayThi, fDate);
            DateTimeFormatter fTime = DateTimeFormatter.ofPattern("HH:mm");
            time = LocalTime.parse(this.gioThi, fTime);
        }
        String STT(){
            return String.format("C%03d", this.stt);
        }
        void showInfo(){
            System.out.printf("%s %s %s %s\n", STT(), this.ngayThi, this.gioThi, this.ID);
        }
    }
    public static void main(String[] args) {
        try {
            File file = new File("CATHI.in");
            Scanner sc = new Scanner(file);
            ArrayList<CaThi> arr = new ArrayList<>();
            int t = Integer.parseInt(sc.nextLine());
            for (int stt = 1; stt <= t; stt++){
                arr.add(new CaThi( sc.nextLine(),  sc.nextLine(), Long.parseLong(sc.nextLine()), stt));
            }
            arr.sort(Comparator
                    .comparing((CaThi a) -> a.date)
                    .thenComparing((CaThi a) -> a.time)
                    .thenComparingLong((CaThi a) -> a.ID)
            );
            for (CaThi ct : arr){
                ct.showInfo();
            }
        } catch (FileNotFoundException e){
            System.out.println();
        }
    }
}
