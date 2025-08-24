import java.util.Scanner;
import java.util.TreeSet;

public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();

        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            set1.add(x);
        }
        for (int i = 0; i < m; i++){
            int x = sc.nextInt();
            set2.add(x);
        }

        TreeSet<Integer> set = new TreeSet<>(set1);
        set.addAll(set2);
        for (int i : set){
            System.out.print(i + " ");
        }
    }
}
