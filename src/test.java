import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class test{
    static class XeTai{
        private String ma, hang;
        private boolean coThung;
        private int giaBan, ngayLanBanh;
        private double trongTai;
        public XeTai(int ma, String hang, double trongTai, String ngayLanBanh, boolean coThung, int gia){
            this.ma = String.format("%s%03d",hang.substring(0,1).toUpperCase(), ma);
            this.hang = hang;
            this.ngayLanBanh = Integer.parseInt(ngayLanBanh.substring(6));
            this.trongTai = trongTai;
            this.coThung = coThung;

            if (this.ngayLanBanh >= 2020){
                this.giaBan = gia + (gia * 10 / 100);
            }
            else {
                this.giaBan = gia - (gia * 20 / 100);
            }

            if (this.coThung) this.giaBan += 500;
        }

        @Override
        public String toString(){
            return String.format("%s %s %d %.1f %d", this.ma, this.hang, this.ngayLanBanh, this.trongTai, this.giaBan);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");
        Scanner sc = new Scanner(file);
        int t = 1;
        while (sc.hasNextLine()){
            String hang = sc.nextLine();
            double trongTai = Double.parseDouble(sc.nextLine());
            boolean coThung = Boolean.parseBoolean(sc.nextLine());
            String ngayLanBanh = sc.nextLine();
            int gia = Integer.parseInt(sc.nextLine());

            XeTai xt = new XeTai(t, hang, trongTai, ngayLanBanh, coThung, gia);
            System.out.println(xt);
        }
    }
}
//BAI 4 (XE TAI) bỏ file trước khi submit