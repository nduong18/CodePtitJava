import java.util.Scanner;

public class J04012 {
    static class NhanVien{
        final private String name;
        final private int basicSalary;
        final private int day;
        final private String level;
        public NhanVien(String name, int basicSalary, int day, String level){
            this.name = name;
            this.basicSalary = basicSalary;
            this.day = day;
            this.level = level;
        }
        int phuCap(){
            String s = String.valueOf(this.level);
            if (s.equals("GD")) return 250000;
            if (s.equals("PGD")) return 200000;
            if (s.equals("TP")) return 180000;
            return 150000;
        }
        int tienLuong(){
            return this.basicSalary * this.day;
        }
        int tienThuong(){
            if (this.day >= 25) return tienLuong() * 20 / 100;
            if (this.day >= 22) return tienLuong() * 10 / 100;
            return 0;
        }
        int thuNhap(){
            return tienLuong() + tienThuong() + phuCap();
        }
        void showInfo(){
            System.out.printf("NV01 %s %d %d %d %d\n", this.name, tienLuong(), tienThuong(), phuCap(), thuNhap());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int basicSalary = sc.nextInt();
        sc.nextLine();
        int day = sc.nextInt();
        sc.nextLine();
        String level = sc.nextLine();
        NhanVien nv = new NhanVien(name, basicSalary, day, level);
        nv.showInfo();
    }
}
