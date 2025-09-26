import java.util.*;
public class J05009 {
    static class ThiSinh{
        private String ten, ns;
        private double diem1, diem2, diem3;
        public double tong;
        private int stt;
        public ThiSinh(int stt, String ten, String ns, double diem1, double diem2, double diem3){
            this.ten = ten;
            this.ns = ns;
            this.diem1 = diem1;
            this.diem2 = diem2;
            this.diem3 = diem3;
            this.tong = diem1 + diem2 + diem3;
            this.stt = stt;
        }
        @Override
        public String toString(){
            return String.format("%d %s %s %.1f", this.stt, this.ten, this.ns, this.tong);
        }    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        double MAX = 0;
        List<ThiSinh> list = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            String ten = sc.nextLine();
            String ns = sc.nextLine();
            double diem1 = Double.parseDouble(sc.nextLine());
            double diem2 = Double.parseDouble(sc.nextLine());
            double diem3 = Double.parseDouble(sc.nextLine());
            ThiSinh ts = new ThiSinh(i, ten, ns, diem1, diem2, diem3);
            if (ts.tong > MAX) MAX = ts.tong;
            list.add(ts);
        }
        for (ThiSinh ts : list) {
            if (ts.tong == MAX){
                System.out.println(ts);
            }
        }
        
    }
}
