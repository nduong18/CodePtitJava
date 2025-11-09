import java.util.*;

public class J05036 {
    static class MatHang{
        private String ma, ten, donVi;
        private float donGia, soLuong;

        public MatHang(int ma, String ten, String donVi, int donGia, int soLuong) {
            this.ma = String.format("MH%02d", ma);
            this.ten = ten;
            this.donVi = donVi;
            this.donGia = donGia;
            this.soLuong = soLuong;
        }

        public int getPhiVanChuyen(){
            return Math.round((donGia * soLuong) * ((float) 5 / 100));
        }

        public int getThanhTien(){
            return Math.round(donGia * soLuong + getPhiVanChuyen());
        }

        public int getGiaBan(){
            return getThanhTien() + getThanhTien() * 2 / 100;
        }

        @Override
        public String toString(){
            return String.format("%s %s %s %d %d %d", ma, ten, donVi, getPhiVanChuyen(), getThanhTien(), getGiaBan());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<MatHang> list = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            list.add(new MatHang(i, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        for (MatHang mh : list) System.out.println(mh);
    }
}
