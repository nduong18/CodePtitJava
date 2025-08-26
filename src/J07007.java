import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class J07007 {
    public static void main(String[] args) {
        try {
            File file = new File("VANBAN.in");
            Scanner sc = new Scanner(file);
            TreeSet<String> set = new TreeSet<>();
            while (sc.hasNextLine()){
                String[] words = sc.nextLine().toLowerCase().trim().split("\\s+");
                Collections.addAll(set, words);
            }
            for (String s : set){
                System.out.println(s);
            }
        } catch (FileNotFoundException e){
            System.out.println();
        }
    }
}
