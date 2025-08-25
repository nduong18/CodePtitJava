import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        HashMap<String, Integer> counter = new HashMap<>();
        ArrayList<String> names = new ArrayList<>();
        while (t-- > 0){
            String name = sc.nextLine();
            String[] words = name.trim().split("\\s+");
            String result = words[words.length - 1].toLowerCase();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < words.length - 1; i++){
                sb.append(Character.toLowerCase(words[i].charAt(0)));
            }
            result += sb;
            names.add(result);
        }
        for (String i : names){
            counter.put(i, counter.getOrDefault(i, 0) + 1);
            String res = i;
            int x = counter.get(i);
            if (x != 1) res += x;
            res += "@ptit.edu.vn";
            System.out.println(res);
        }
    }
}
