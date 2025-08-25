import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            TreeSet<String> set1 = new TreeSet<>(Arrays.asList(s1.trim().split("\\s+")));
            TreeSet<String> set2 = new TreeSet<>(Arrays.asList(s2.trim().split("\\s+")));
            for (String s : set1){
                if (!set2.contains(s)) System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
