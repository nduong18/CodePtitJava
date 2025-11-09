import java.util.Scanner;

public class test1 {
    interface IDichVu{
        boolean isMa(String ma);
        boolean isDienThoai(String ngay);
        double getTienNop();
    }
    static class DichVu{
        private String ma, ten, soDienThoai;
        public DichVu(){}
        public DichVu(String ma, String ten,String soDienThoai){
            this.ma = ma;
            this.ten = ten;
            this.soDienThoai = soDienThoai;
        }

        public void setMa(String ma){
            this.ma = ma;
        }
        public void setTen(String ten){
            this.ten = ten;
        }
        public void setSoDienThoai(String soDienThoai){
            this.soDienThoai = soDienThoai;
        }
        public String getMa(){
            return this.ma;
        }
        public String getTen(){
            return this.ten;
        }
        public String getSoDienThoai(){
            return this.soDienThoai;
        }
    }
    static class DVDien extends DichVu implements IDichVu{
        private int thang, soKW;
        public DVDien(){}
        public DVDien(String ma, String ten, String soDienThoai, int soKW, int thang){
            super(ma, ten, soDienThoai);
            this.soKW = soKW;
            this.thang = thang;
        }
        public void input(Scanner in){
            String tmp;
            while (getMa() == null || getMa().isEmpty()){
                tmp = in.nextLine().trim();
                if (!isMa(tmp.toLowerCase())){
                    System.out.println("nhap sai");
                }
                else {
                    setMa(tmp.toLowerCase());
                }
            }

            setTen(in.nextLine().trim());
            thang = Integer.parseInt(in.nextLine().trim());

            while (getSoDienThoai() == null || getSoDienThoai().isEmpty()){
                tmp = in.nextLine().trim();
                if (!isDienThoai(tmp)){
                    System.out.println("nhap sai");
                }
                else {
                    setSoDienThoai(tmp);
                }
            }

            soKW = Integer.parseInt(in.nextLine());
        }
        public void setThang(int thang){
            this.thang = thang;
        }
        public void setSoKW(int soKW){
            this.soKW = soKW;
        }
        public int getThang(){
            return this.thang;
        }
        public int getSoKW(){
            return this.soKW;
        }
        @Override
        public String toString(){
            return String.format("%s %s %s %d %.1f", getMa().toUpperCase(), getTen(), getSoDienThoai(), getSoKW(), getTienNop());
        }

        @Override
        public boolean isMa(String ma) {
            return ma.matches("^(hn|da)\\d{2}t\\d{2}$");
        }

        @Override
        public boolean isDienThoai(String soDT) {
            return soDT.matches("^(0)\\d{9}$");
        }

        @Override
        public double getTienNop() {
            if (soKW >= 0 && soKW <= 50) return soKW * 1000;
            if (soKW >= 51 && soKW <= 100) return soKW * 2000;
            if (soKW >= 101 && soKW <= 200) return soKW * 3000;
            return soKW * 4000;
        }
    }
    public static void main(String[] args) {
        DVDien a=new DVDien();
        Scanner in=new Scanner(System.in);
        a.input(in);
        System.out.println(a);

    }
}
