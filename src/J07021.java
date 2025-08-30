import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07021 {
    public static void main(String[] args) {
        try {
            File file = new File("DATA.in");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String s = sc.nextLine();
                if (s.equals("END")) break;
                String[] names = s.toLowerCase().trim().split("\\s+");
                StringBuilder sb = new StringBuilder();
                for (String name : names){
                    sb.append(Character.toUpperCase(name.charAt(0))).append(name.substring(1)).append(" ");
                }
                System.out.println(sb.toString().trim());
            }
        } catch (FileNotFoundException e){
            System.out.println();
        }
    }
}
