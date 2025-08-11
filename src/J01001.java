import java.util.Scanner;

public class J01001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strNum= input.split(" ");
        int cd = Integer.parseInt(strNum[0]);
        int cr = Integer.parseInt(strNum[1]);

        if (cd <= 0 || cr <= 0){
            System.out.println("0");
        }
        else{
            if (cr > cd) {
                int tmp = cd;
                cd = cr;
                cr = tmp;
            }
            int chuVi = (cd + cr) * 2;
            int dienTich = cd * cr;
            System.out.println(chuVi + " " + dienTich);
        }
    }
}
