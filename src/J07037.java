import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J07037 {
    static class DoanhNghiep{
        final private String maDN, tenDN;
        final private int soSV;
        public DoanhNghiep(String maDN, String tenDN, int soSV){
            this.maDN = maDN;
            this.tenDN = tenDN;
            this.soSV = soSV;
        }
        void showInfo(){
            System.out.printf("%s %s %d\n", this.maDN, this.tenDN, this.soSV);
        }
    }
    public static void main(String[] args) {
        try {
            File file = new File("DN.in");
            Scanner sc = new Scanner(file);
            int t = Integer.parseInt(sc.nextLine());
            ArrayList<DoanhNghiep> arr = new ArrayList<>();
            while (t-- > 0){
                arr.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
            }
            arr.sort(Comparator.comparing(a -> a.maDN));
            for (DoanhNghiep i : arr) i.showInfo();
        } catch (FileNotFoundException e){
            System.out.println();
        }
    }
}
