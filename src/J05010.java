import java.util.*;

public class J05010 {
    static class MatHang{
        private String ten, nhom;
        private double giaMua, giaBan, loiNhuan;
        private int stt;
        public MatHang(String ten, String nhom, double giaMua, double giaBan, int stt){
            this.ten = ten;
            this.nhom = nhom;
            this.giaMua = giaMua;
            this.giaBan = giaBan;
            this.stt = stt;
            this.loiNhuan = giaBan - giaMua;
        }

        @Override
        public String toString(){
            return String.format("%d %s %s %.2f", this.stt, this.ten, this.nhom, this.loiNhuan);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<MatHang> list = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            String ten = sc.nextLine().trim();
            String nhom = sc.nextLine().trim();
            double giaMua = Double.parseDouble(sc.nextLine());
            double giaBan = Double.parseDouble(sc.nextLine());
            MatHang mh = new MatHang(ten, nhom, giaMua, giaBan, i);
            list.add(mh);
        }
        list.sort((a, b) -> {
            return Double.compare(b.loiNhuan, a.loiNhuan);
        });
        for (MatHang mh : list) System.out.println(mh);
    }
}
