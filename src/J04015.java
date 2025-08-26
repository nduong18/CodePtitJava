import java.util.Scanner;

public class J04015 {
    static class GiaoVien{
        final private String code;
        final private String name;
        final private int basicSalary;
        public GiaoVien(String code, String name, int basicSalary){
            this.code = code;
            this.name = name;
            this.basicSalary = basicSalary;
        }
        public int levelSalary(String s){
            return Integer.parseInt(s.substring(2));
        }
        public int phuCap(String s){
            String pc = s.substring(0,2);
            if (pc.equals("HT")) return 2000000;
            if (pc.equals("HP")) return 900000;
            return 500000;
        }
        public int thuNhap(){
            return basicSalary * levelSalary(this.code) + phuCap(this.code);
        }
        public void showInfo(){
            System.out.printf("%s %s %d %d %d", this.code, this.name, levelSalary(this.code), phuCap(this.code), thuNhap());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine(), name = sc.nextLine();
        int basicSalary = sc.nextInt();
        GiaoVien gv = new GiaoVien(code, name, basicSalary);
        gv.showInfo();
    }
}
