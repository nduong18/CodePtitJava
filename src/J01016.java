import java.util.Scanner;

public class J01016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt4 = 0, cnt7 = 0;
        for (char c : s.toCharArray()){
            if (c == '4') cnt4++;
            if (c == '7') cnt7++;
        }
        if ((cnt4 + cnt7 == 4) || (cnt4 + cnt7 == 7)) System.out.println("YES");
        else System.out.println("NO");
    }
}
