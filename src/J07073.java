import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J07073 {
    static class GiangDay{
        private final String ma, ten, lt, th;
        private final int tc;
        public GiangDay(String ma, String ten, int tc, String lt, String th){
            this.ma = ma;
            this.ten = ten;
            this.tc = tc;
            this.lt = lt;
            this.th = th;
        }
        void showInfo(){
            System.out.printf("%s %s %d %s %s\n", this.ma, this.ten, this.tc, this.lt, this.th);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<GiangDay> arr = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            arr.add(new GiangDay(sc.nextLine(),
                    sc.nextLine(),
                    Integer.parseInt(sc.nextLine()),
                    sc.nextLine(), sc.nextLine()));
        }
        arr.sort(Comparator.comparing(a -> a.ma));
        for (GiangDay g : arr) {
            String[] words = g.th.trim().split("\\.");
            if ((g.th.equals("Truc tuyen") || words.length != 0) && !g.th.equals("Truc tiep"))
                g.showInfo();
        }
    }
}
