import java.util.*;
public class J05006 {
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
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++){
            NhanVien nv = new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            System.out.println(nv);
        }
    }
}
