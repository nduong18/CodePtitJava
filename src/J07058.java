import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J07058 {
    static class MonHoc{
        final private String code, name, ht;
        private MonHoc(String code, String name, String ht){
            this.code = code;
            this.name = name;
            this.ht = ht;
        }
        public void showInfo(){
            System.out.printf("%s %s %s\n", code, name, ht);
        }
    }
    public static void main(String[] args) {
        try {
            File file = new File("MONHOC.in");
            Scanner sc = new Scanner(file);
            int t = sc.nextInt();
            sc.nextLine();
            ArrayList<MonHoc> listMonHoc = new ArrayList<>();
            for (int i = 0; i < t; i++){
                String code = sc.nextLine(), name = sc.nextLine(), ht = sc.nextLine();
                MonHoc m = new MonHoc(code, name, ht);
                listMonHoc.add(m);
            }
            listMonHoc.sort(Comparator.comparing(a -> a.code));
            for (MonHoc m : listMonHoc){
                m.showInfo();
            }
        } catch (FileNotFoundException e){
            System.out.println();
        }
    }
}
