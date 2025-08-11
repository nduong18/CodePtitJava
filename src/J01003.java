import java.util.Scanner;

public class J01003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strNum = input.split(" ");
        int a = Integer.parseInt(strNum[0]);
        int b = Integer.parseInt(strNum[1]);

        if (a == 0 && b != 0){
            System.out.println("VN");
        }
        else if (a == 0) {
            System.out.println("VSN");
        } else {
            double x = - (double) b / a;
            String kq = String.format("%.2f",x);
            System.out.println(kq);
        }
    }
}
