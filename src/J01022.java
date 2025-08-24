import java.util.ArrayList;
import java.util.Scanner;

public class J01022 {
    static ArrayList<String> arr = new ArrayList<>();
    static void init(){
        arr.add("");
        arr.add("0");
        arr.add("1");
        for (int i = 3; i <= 92; i++){
            arr.add(arr.get(i-1) + arr.get(i-2));
        }
    }
    public static void main(String[] args) {
        init();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(arr.get(n).charAt(k));
        }
    }
}
