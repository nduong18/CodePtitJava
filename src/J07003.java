import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003 {
    public static void main(String[] args) {
        try{
            File file = new File("DATA.in");
            Scanner sc = new Scanner(file);

            String s = sc.nextLine();
            while (s.length() > 1){
                int index = s.length() / 2;
                String s1 = s.substring(0, index);
                String s2 = s.substring(index);
                BigInteger n1 = new BigInteger(s1);
                BigInteger n2 = new BigInteger(s2);
                BigInteger n = n1.add(n2);
                s = n.toString();
                System.out.println(s);
            }
        }
        catch (FileNotFoundException e){
            System.out.println();
        }
    }
}
