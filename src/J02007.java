import java.util.LinkedHashMap;
import java.util.Scanner;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= t; i++){
            int n = sc.nextInt();
            LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
            for (int j = 0; j < n; j++){
                int x = sc.nextInt();
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
            System.out.println("Test " + i +":");
            map.forEach((k,v) -> System.out.println(k + " xuat hien " + v + " lan"));
        }
    }
}
