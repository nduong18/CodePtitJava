import java.util.LinkedHashMap;
import java.util.Scanner;

public class J03020 {
    static boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> map =  new LinkedHashMap<>();
        int maxLen = 0;
        while (sc.hasNextLine()){
            String s = sc.nextLine();
            String[] str = s.trim().split("\\s+");
            for (String z : str) {
                map.put(z , map.getOrDefault(z, 0) + 1);
                maxLen = Math.max(maxLen, z.length() - 1);
            }
        }
        for (String value : map.keySet()){
            if (isPalindrome(value) && value.length() == maxLen)
                System.out.println(value + " " + map.get(value));
        }
    }
}
