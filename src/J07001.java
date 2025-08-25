import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07001 {
    public static void main(String[] args) {
        try{
            File file = new File("DATA.in");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e){
            System.out.println();
        }
    }
}
