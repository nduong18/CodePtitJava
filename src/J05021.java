import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J05021 {
    static class SinhVien{
        private final String msv, hoten, lop, email;
        public  SinhVien(String msv, String hoten, String lop, String email){
            this.msv = msv;
            this.hoten = hoten;
            this.lop = lop;
            this.email = email;
        }

        @Override
        public String toString(){
            return this.msv + " " + this.hoten + " " + this.lop + " " + this.email;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SinhVien> list = new ArrayList<>();
        while (sc.hasNextLine()){
            SinhVien sv = new SinhVien(sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim());
            list.add(sv);
        }
        list.sort((a, b) -> {
            return a.msv.compareTo(b.msv);
        });
        for (SinhVien sv : list) System.out.println(sv);
    }
}
