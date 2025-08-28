import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J07072 {
    public static class FullName{
        final public String ho, dem, ten;
        public FullName(String ho, String dem, String ten){
            this.ho = ho;
            this.dem = dem;
            this.ten = ten;
        }
        public void showInfo(){
            System.out.printf("%s %s %s\n", this.ho, this.dem, this.ten);
        }
    }
    public static void main(String[] args) {
        try {
            File file = new File("DANHSACH.in");
            Scanner sc = new Scanner(file);
            ArrayList<FullName> arr = new ArrayList<>();
            while (sc.hasNextLine()){
                String s = sc.nextLine();
                String[] words = s.toLowerCase().trim().split("\\s+");
                String ho = Character.toUpperCase(words[0].charAt(0)) + words[0].substring(1);
                String ten = Character.toUpperCase(words[words.length-1].charAt(0)) + words[words.length-1].substring(1);
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i < words.length-1; i++){
                    sb.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
                }
                String dem = sb.toString().trim();
                FullName fn = new FullName(ho,dem,ten);
                arr.add(fn);
            }
            arr.sort(Comparator.comparing((FullName a) -> a.ten).thenComparing(a -> a.ho).thenComparing(a -> a.dem));
            for (FullName fn : arr){
                fn.showInfo();
            }
        } catch (FileNotFoundException e){
            System.out.println();
        }
    }
}
