import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J05025 {
    static class GiangVien{
        private String ten, mon;
        public String stt;
        public GiangVien(String ten, String mon, int stt){
            this.ten = ten;
            String[] MON = mon.split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (String s : MON){
                sb.append(s.substring(0,1).toUpperCase());
            }
            this.mon = sb.toString();
            this.stt = String.format("GV%02d",stt);
        }

        @Override
        public String toString(){
            return String.format("%s %s %s", this.stt, this.ten, this.mon);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<GiangVien> list = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            GiangVien gv = new GiangVien(sc.nextLine().trim(), sc.nextLine().trim(), i);
            list.add(gv);
        }
        list.sort((a, b) -> {
            String[] A = a.ten.split("\\s+");
            String tmpA = A[A.length-1];
            String[] B = b.ten.split("\\s+");
            String tmpB = B[B.length-1];

            int cmp = tmpA.compareTo(tmpB);
            if (cmp != 0) return cmp;
            return a.stt.compareTo(b.stt);
        });
        for (GiangVien gv : list) System.out.println(gv);
    }
}
