import java.util.*;
public class J05007 {
    static class NhanVien{
        private String mnv, ten, ns, gt, dc, mst, hd;
        public NhanVien(int mnv, String ten, String gt, String ns, String dc, String mst, String hd){
            this.mnv = String.format("%05d", mnv);
            this.ten = ten.trim();
            this.gt = gt.trim();
            this.ns = ns.trim();
            this.dc = dc.trim();
            this.mst = mst.trim();
            this.hd = hd.trim();
        }
        @Override
        public String toString(){
            return String.format("%s %s %s %s %s %s %s", this.mnv, this.ten, this.gt, this.ns, this.dc, this.mst, this.hd);
        }
        public String getDOB(){
            return this.ns;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<NhanVien> list = new ArrayList();
        for (int i = 1; i <= t; i++){
            NhanVien nv = new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(nv);
        }
        list.sort((a, b) -> {
            String[] x = a.getDOB().split("/");
            String[] y = b.getDOB().split("/");
            
            int da = Integer.parseInt(x[0]);
            int ma = Integer.parseInt(x[1]);
            int ya = Integer.parseInt(x[2]);
            
            int db = Integer.parseInt(y[0]);
            int mb = Integer.parseInt(y[1]);
            int yb = Integer.parseInt(y[2]);
            
            if (ya != yb) return ya - yb;
            if (ma != mb) return ma - mb;
            return da - db;
        });
        for (NhanVien nv : list) System.out.println(nv);
    }
}
