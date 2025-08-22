import java.util.Scanner;
import java.util.TreeMap;

public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        int index = 1;
        while (t-- > 0){
            int n = sc.nextInt();
            TreeMap<Integer,Integer> map = new TreeMap<>();

            for (int i = 2; i <= Math.sqrt(n); i++){
                while (n % i == 0){
                    map.put(i, map.getOrDefault(i,0) + 1);
                    n /= i;
                }
            }

            if (n > 1) map.put(n, map.getOrDefault(n,0) + 1);

            System.out.printf("Test %d: ", index);
            for (int key : map.keySet()){
                System.out.printf("%d(%d) ", key, map.get(key));
            }
            System.out.println();
            index++;
        }
    }
}
