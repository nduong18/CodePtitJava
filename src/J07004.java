import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class J07004 {
    public static void main(String[] args) {
        try {
            File file = new File("DATA.in");
            Scanner sc = new Scanner(file);
            TreeMap<Integer,Integer> map = new TreeMap<>();
            while (sc.hasNextInt()){
                int x = sc.nextInt();
                map.put(x, map.getOrDefault(x,0) + 1);
            }
            for (int key : map.keySet()){
                System.out.println(key + " " + map.get(key));
            }
        } catch (FileNotFoundException e){
            System.out.println();
        }
    }
}
