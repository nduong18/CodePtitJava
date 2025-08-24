import java.util.Scanner;

public class J03005 {
    static String normalizeName(String name){
        name = name.trim().replaceAll("\\s+"," ");
        String[] words = name.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < words.length; i++){
            sb.append(Character.toUpperCase(words[i].charAt(0)));
            sb.append(words[i].substring(1).toLowerCase());
            if (i == words.length - 1) sb.append(", ");
            else sb.append(" ");
        }
        sb.append(words[0].toUpperCase());
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0){
            String line = sc.nextLine();
            System.out.println(normalizeName(line));
        }
    }
}
