import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J07033 {
    static class SinhVien{
        final private String msv, ten, lop, email;
        public SinhVien(String msv, String ten, String lop, String email){
            this.msv = msv;
            this.ten = ten;
            this.lop = lop;
            this.email = email;
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
            System.out.printf("%s %s %s %s\n", this.msv, chuanHoaTen(), this.lop, this.email);
        }
    }
    public static void main(String[] args) {
        try {
            File file = new File("SINHVIEN.in");
            Scanner sc = new Scanner(file);
            int t = Integer.parseInt(sc.nextLine());
            ArrayList<SinhVien> arr = new ArrayList<>();
            while (t-- > 0){
                arr.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
            }
            arr.sort(Comparator.comparing(a -> a.msv));
            for (SinhVien sv : arr){
                sv.showInfo();
            }
        } catch (FileNotFoundException e){
            System.out.println();
        }
    }
}
