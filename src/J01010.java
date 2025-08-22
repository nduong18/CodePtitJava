import java.util.Scanner;

public class J01010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0){
            String s = sc.nextLine();
            boolean check = true;
            StringBuilder tmp = new StringBuilder();

            for (int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                switch (c){
                    case '1':
                        tmp.append('1');
                        break;
                    case '0':
                    case '8':
                    case '9':
                        tmp.append('0');
                        break;
                    default:
                        check = false;
                        break;
                }
            }

            String result = tmp.toString();
            long r = Long.parseLong(result);
            if (check && r != 0) System.out.println(r);
            else System.out.println("INVALID");
        }
    }
}
