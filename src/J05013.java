import java.util.*;
public class J05013 {
    static class ThiSinh{
        private String ms, ten, hocLuc;
        private double lt, th, dtb;
        public ThiSinh(int ms, String ten, String lt, String th){
            this.ms = String.format("TS%02d", ms);
            this.ten = ten;
            
            if (!lt.contains(".")){
                if (lt.equals("10")){
                    this.lt = 10;
                }
                else {
                    this.lt = Double.parseDouble(String.format("%s.%s",lt.substring(0,1), lt.substring(1)));
                }
            }
            else{
                this.lt = Double.parseDouble(lt);
            }
            
            if (!th.contains(".")){
                if (th.equals("10")){
                    this.th = 10;
                }
                else {
                    this.th = Double.parseDouble(String.format("%s.%s",th.substring(0,1), th.substring(1)));
                }
            }       
            else {
                this.th = Double.parseDouble(th);
            }
            
            this.dtb = (this.lt + this.th) / 2.0;
            if (dtb > 9.5) hocLuc = "XUAT SAC";
            else if (dtb >= 8) hocLuc = "DAT";
            else if (dtb > 5) hocLuc = "CAN NHAC";
            else hocLuc = "TRUOT";
        }
        @Override
        public String toString(){
            return String.format("%s %s %.2f %s", this.ms, this.ten, this.dtb, this.hocLuc);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<ThiSinh> list = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            ThiSinh ts = new ThiSinh(i, sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(ts);
        }
        list.sort((a, b) -> Double.compare(b.dtb, a.dtb));
        for (ThiSinh ts : list) System.out.println(ts);
    }
}
