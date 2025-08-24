import java.util.ArrayList;
import java.util.Scanner;

public class J02004 {
    static boolean check(ArrayList<Integer> arr){
        int l = 0, r = arr.size() - 1;
        while (l <= r){
            if (!arr.get(l).equals(arr.get(r))) return false;
            l++;
            r--;
        }
        return  true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++){
                arr.add(sc.nextInt());
            }
            if (check(arr)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
