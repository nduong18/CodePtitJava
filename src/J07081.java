import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J07081 {
    static class SinhVien{
        private final String msv, hoVaTen, sdt, email, ho, dem, ten;
        public SinhVien(String msv, String hoVaTen, String sdt, String email){
            this.msv = msv;
            this.sdt = sdt;
            this.email = email;
            this.hoVaTen = hoVaTen;

            String[] names = hoVaTen.trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            this.ten = names[names.length - 1];
            this.ho = names[0];
            for (int i = 1; i < names.length-1; i++){
                sb.append(names[i]).append(" ");
            }
            this.dem = sb.toString().trim();
        }
        void showInfo(){
            System.out.printf("%s %s %s %s\n", this.msv, this.hoVaTen, this.sdt, this.email);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        while (t-- > 0){
            arr.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        arr.sort(Comparator.comparing((SinhVien a) -> a.ten).thenComparing(a -> a.ho).
                thenComparing(a -> a.dem). thenComparing(a -> a.msv));
        for (SinhVien sv : arr) sv.showInfo();
    }
}
