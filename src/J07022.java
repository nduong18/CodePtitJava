import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07022 {
    static boolean check(String x){
        for (int i = 0; i < x.length(); i++){
            if (!Character.isDigit(x.charAt(i))) return true;
        }
        return x.length() > 10;
    }
    public static void main(String[] args) {
        try{
            File file = new File("DATA.in");
            Scanner sc = new Scanner(file);
            ArrayList<String> arr = new ArrayList<>();
            while (sc.hasNextLine()){
                String[] words = sc.nextLine().trim().split("\\s+");
                for (String word : words) {
                    if (check(word)) {
                        arr.add(word);
                    }
                }
            }
            Collections.sort(arr);
            for (String s : arr){
                System.out.printf("%s ",s);
            }
        } catch (FileNotFoundException e){
            System.out.println();
        }
    }
}
