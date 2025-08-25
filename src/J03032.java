import java.util.Scanner;

public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String[] words = sc.nextLine().trim().split("\\s+");
            for (String s : words){
                StringBuilder sb = new StringBuilder(s);
                System.out.print(sb.reverse() + " ");
            }
            System.out.println();
        }
    }
}
