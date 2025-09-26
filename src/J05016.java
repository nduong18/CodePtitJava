import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class J05016 {
    static class KhachHang{
        private String ten, sp, nnp, ntp, ms;
        private long ps;
        private long day, tongTien;
        public KhachHang(String ten, String sp, String nnp, String ntp, long ps, int stt){
            ms = String.format("KH%02d", stt);
            this.ten = ten.trim();
            this.sp = sp.trim();
            
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate start = LocalDate.parse(nnp.trim(), fmt);
            LocalDate end = LocalDate.parse(ntp.trim(), fmt);
            day =  ChronoUnit.DAYS.between(start, end) + 1;
            
            String lv = sp.substring(0,1);
            long donGia;
            if (lv.equals("1")) donGia = 25;
            else if (lv.equals("2")) donGia = 34;
            else if (lv.equals("3")) donGia = 50;
            else donGia = 80;
            
            tongTien = day * donGia + ps;
        }
        @Override
        public String toString(){
            return String.format("%s %s %s %d %d", this.ms, this.ten, this.sp, this.day, this.tongTien);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<KhachHang> list = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            String ten = sc.nextLine();
            String sp = sc.nextLine();
            String nnp = sc.nextLine();
            String ntp = sc.nextLine();
            long ps = Long.parseLong(sc.nextLine());
            KhachHang kh = new KhachHang(ten, sp, nnp, ntp, ps, i);
            list.add(kh);
        }
        list.sort((a , b) -> Long.compare(b.tongTien, a.tongTien));
        for (KhachHang kh : list) System.out.println(kh);
    }
}
