import java.util.Scanner;

public class test1 {
    static class SinhVien{
        private String maSV, hoVaDem, ten;
        private int tuoi;
        private boolean gioiTinh;
        private double diem1, diem2;
        public SinhVien(){}
        public void setMaSV(int num){
            //this.maSV = String.format("D22DCCN%03d", num);
            this.maSV = "D22DCCN" + num;
        }
        public void setDiem(double diem1, double diem2){
            this.diem1 = diem1;
            this.diem2 = diem2;
        }
        public String getHoVaTen(){
            return hoVaDem + " " + ten;
        }
        public double getGPA(){
            return (this.diem1+this.diem2*2) / 3;
        }
        public String getXepLoai(){
            String st = "";
            double t = getGPA();
            if (t < 5) st = "yeu";
            else if (t < 6.5) st = "trung binh";
            else if (t < 8) st = "kha";
            else if (t < 9) st = "gioi";
            else st = "xuat sac";
            return st;
        }
        public void input(){
            Scanner sc = new Scanner(System.in);
            int num = Integer.parseInt(sc.nextLine());
            setMaSV(num);
            this.hoVaDem = sc.nextLine();
            this.ten = sc.nextLine();
            int t;
            while (true){
                t = Integer.parseInt(sc.nextLine());
                if (t >= 18 && t <= 23) break;
                System.out.println("nhap sai");
            }
            this.tuoi = t;
            this.gioiTinh = Boolean.parseBoolean(sc.nextLine())    ;
            double d;
            while (true){
                d = Double.parseDouble(sc.nextLine());
                if (d >= 0 && d <= 10) break;
                System.out.println("nhap sai");
            }
            this.diem1 = d;
            while (true){
                d = Double.parseDouble(sc.nextLine());
                if (d >= 0 && d <= 10) break;
                System.out.println("nhap sai");
            }
            this.diem2 = d;
        }
        public void output(){
            String t = this.maSV + " " + getHoVaTen() + " " + this.tuoi + " " + (this.gioiTinh?"nam":"nu") + " " +
                    String.format("%.1f", getGPA()) + " " + getXepLoai();
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        SinhVien s = new SinhVien();
        s.input();
        s.setDiem(4, 8);
        s.output();
        System.out.println(s.getHoVaTen() + " " + s.getXepLoai());
    }
}
