import java.util.Scanner;

public class J04007 {
    static class NhanVien{
        final private String name;
        final private String gender;
        final private String date;
        final private String address;
        final private String mst;
        final private String hd;
        public NhanVien(String name, String gender, String date, String address, String mst, String hd){
            this.name = name;
            this.gender = gender;
            this.date = date;
            this.address = address;
            this.mst = mst;
            this.hd = hd;
        }
        public String chuanHoa(String s){
            String[] words = s.trim().split("/");
            if (words[0].length() == 1) words[0] = "0" + words[0];
            if (words[1].length() == 1) words[1] = "0" + words[1];
            return words[0] + "/" + words[1] + "/" + words[2];
        }
        public void showInfo(){
            System.out.printf("00001 %s %s %s %s %s %s", this.name, this.gender, chuanHoa(this.date), this.address, this.mst, chuanHoa(this.hd));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(), gender = sc.nextLine(), date = sc.nextLine(),
                address = sc.nextLine(), mst = sc.nextLine(), hd = sc.nextLine();
        NhanVien nv = new NhanVien(name,gender,date,address,mst,hd);
        nv.showInfo();
    }
}
