import java.io.File;
import java.io.IOException;
import java.util.*;

public class J07071 {
    static class Ten{
        private final String ho, ten;
        public Ten(String ho, String ten){
            this.ho = ho;
            this.ten = ten;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        HashMap<ArrayList, Ten> dsTen = new HashMap<>();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] names = s.trim().split("\\s+");
            ArrayList<String> arr = new ArrayList<>();
            String ten = names[names.length - 1];
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < names.length - 1; i++) {
                arr.add(names[i]);
                sb.append(Character.toUpperCase(names[i].charAt(0))).append(names[i].substring(1)).append(" ");
            }
            dsTen.add(arr, sb.toString().trim());
            int m = Integer.parseInt(sc.nextLine());
            while (m-- > 0) {
                String tuVietTat = sc.nextLine();
                ArrayList<Character> chr = new ArrayList<>();
                for (int i = 0; i < tuVietTat.length(); i += 1) {
                    chr.add(tuVietTat.charAt(i));
                }
            }
        }
    }
}
