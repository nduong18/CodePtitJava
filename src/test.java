import java.util.Scanner;

public class test {
    static class SinhVien{
        private String maSV, hoVaDem, ten;
        private int tuoi;
        private boolean gioitinh;
        private double diem1, diem2;
        public SinhVien(){}
        public void setMaSV(int number){
            this.maSV = String.format("D22DCCN%d",number);
        }
        public void setDiem(double diem1, double diem2){
            this.diem1 = diem1;
            this.diem2 = diem2;
        }
        public String getHoVaTen(){
            return this.hoVaDem + " " + this.ten;
        }
        double getGPA(){
            return (this.diem1 + this.diem2*2) / 3;
        }
        public String getXepLoai(){
            if (getGPA() > 9) return "xuat sac";
            if (getGPA() > 8 && getGPA() <= 9) return "gioi";
            if (getGPA() >= 6.5 && getGPA() < 8) return "kha";
            if (getGPA() >= 5 && getGPA() < 6.5) return "trung binh";
            return "yeu";
        }
        public void input(){
            Scanner sc = new Scanner(System.in);
            int maSV = Integer.parseInt(sc.nextLine());
            this.hoVaDem = sc.nextLine();
            this.ten = sc.nextLine();
            int nhapTuoi = Integer.parseInt(sc.nextLine());
            while (nhapTuoi < 18 || nhapTuoi > 23){
                System.out.println("nhap sai tuoi");
                nhapTuoi = Integer.parseInt(sc.nextLine());
            }
            this.tuoi = nhapTuoi;
            this.gioitinh = sc.nextBoolean();
            this.diem1 = sc.nextDouble();
            sc.nextLine();
            this.diem2 = sc.nextDouble();
            sc.nextLine();
            while (this.diem2 < 0 || this.diem2 > 10){
                System.out.println("nhap sai diem 2");
                diem2 = sc.nextDouble();
            }
            setMaSV(maSV);
        }
        void output(){
            String gioiTinh;
            if (this.gioitinh) gioiTinh = "nam";
            else gioiTinh = "nu";
            System.out.printf("%s %s %d %s %.1f %s\n", this.maSV, getHoVaTen(), this.tuoi, gioiTinh, getGPA(), getXepLoai());
        }
    }
    public static void main(String[] args) {

        SinhVien sv = new SinhVien();
        sv.input();
        sv.setDiem(4, 8);
        sv.output();
        System.out.println(sv.getHoVaTen() + " " + sv.getXepLoai());
    }
}
