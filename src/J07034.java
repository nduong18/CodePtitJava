import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J07034 {
    static class MonHoc{
        final private String maMon, tenMon;
        final private int soTinChi;
        public MonHoc(String maMon, String tenMon, int soTinChi){
            this.maMon = maMon;
            this.tenMon = tenMon;
            this.soTinChi = soTinChi;
        }
        void showInfo(){
           System.out.printf("%s %s %d\n", this.maMon, this.tenMon, this.soTinChi);
        }
    }
    public static void main(String[] args) {
        try {
            File file = new File("MONHOC.in");
            Scanner sc = new Scanner(file);
            int t = Integer.parseInt(sc.nextLine());
            ArrayList<MonHoc> arr = new ArrayList<>();
            while (t-- > 0){
                arr.add(new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
            }
            arr.sort(Comparator.comparing(a -> a.tenMon));
            for (MonHoc m : arr) m.showInfo();
        } catch (FileNotFoundException e){
            System.out.println();
        }
    }
}
