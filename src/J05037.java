import java.util.*;

public class J05037 {
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
            float gia = ((float) getThanhTien() + (float) getThanhTien() * 2 / 100) / soLuong;
            return (int) Math.ceil((gia / 100)) * 100;
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
            list.add(new MatHang(i, sc.nextLine().trim(), sc.nextLine().trim(), Integer.parseInt(sc.nextLine().trim()), Integer.parseInt(sc.nextLine().trim())));
        }
        list.sort((a, b) -> {
            return Integer.compare(b.getGiaBan(), a.getGiaBan());
        });
        for (MatHang mh : list) System.out.println(mh);
    }
}
