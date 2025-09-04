import java.util.Scanner;

public class J03022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine()) sb.append(sc.nextLine()).append(" ");
        String[] lines = sb.toString().toLowerCase().trim().split("[.?!]");
        for (String line : lines){
            line = line.trim().replaceAll("\\s+", " ");
            if (line.isEmpty()) continue;
            System.out.println(Character.toUpperCase(line.charAt(0)) + line.substring(1));
        }
    }
}