import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class J07052 {
    static class ThiSinh{
        private final String ma, ten;
        private final double diem1, diem2, diem3;
        private double tongDiem;
        public ThiSinh(String ma, String ten, double diem1, double diem2, double diem3){
            this.ma = ma;
            this.ten = ten;
            this.diem1 = diem1;
            this.diem2 = diem2;
            this.diem3 = diem3;
            this.tongDiem = diem1 + diem2 + diem3;

            char c = ma.charAt(2);
            if (c == '1') this.tongDiem += 0.5;
            else if (c == '2') this.tongDiem += 1;
            else this.tongDiem += 2.5;
        }


    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){

        }
    }
}
