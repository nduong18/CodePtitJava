import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07002 {
    static boolean isInt(String s){
        if (s.isEmpty()) return false;
        int start = (s.charAt(0) == '-') ? 1 : 0;
        for (int i = start; i < s.length(); i++){
            if (!Character.isDigit(s.charAt(i))) return false;
        }
        try {
            BigInteger val = new BigInteger(s);
            return val.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 &&
                    val.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0;
        }
        catch (Exception e) {
            return false;
        }
    }
    public static void main(String[] args) {
        try {
            File file = new File("DATA.in");
            Scanner sc = new Scanner(file);
            long sum = 0;
            while (sc.hasNextLine()){
                String[] words = sc.nextLine().trim().split("\\s+");
                for (String s : words){
                    if (isInt(s)){
                        sum += Long.parseLong(s);
                    }
                }
            }
            System.out.println(sum);
        } catch (FileNotFoundException e){
            System.out.println();
        }
    }
}
