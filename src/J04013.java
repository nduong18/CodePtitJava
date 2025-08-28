import java.util.Scanner;

public class J04013 {
    public static class ThiSinh{
        final private String ma, ten;
        final private double diemToan, diemLy, diemHoa;
        public ThiSinh(String ma, String ten, double diemToan, double diemLy, double diemHoa){
            this.ma = ma;
            this.ten = ten;
            this.diemToan = diemToan;
            this.diemLy = diemLy;
            this.diemHoa = diemHoa;
        }
        double tongDiem(){
            return this.diemToan + this.diemLy + this.diemHoa;
        }
        void showInfo(){
            System.out.printf("%s %s %f", this.ma, this.ten, tongDiem());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String ten = sc.nextLine();
        double diemToan = sc.nextDouble();
        double diemLy = sc.nextDouble();
        double diemHoa = sc.nextDouble();
        ThiSinh ts = new ThiSinh(ma, ten, diemToan, diemLy, diemHoa);
        ts.showInfo();
    }
}
