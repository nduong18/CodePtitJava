import java.io.File;
import java.io.IOException;
import java.util.*;

public class J07071 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ArrayList<String>> arr = new ArrayList<>();
        while (t-- > 0){
            String[] names = sc.nextLine().trim().split("\\s+");
            ArrayList<String> ten = new ArrayList<>();
            Collections.addAll(ten, names);
            arr.add(ten);
        }
        int m = Integer.parseInt(sc.nextLine());
        while (m-- > 0){
            String[] names = sc.nextLine().trim().split("\\.");
            ArrayList<String> result = new ArrayList<>();
            for (ArrayList<String> as : arr){
                if (names.length == as.size()){
                    boolean check = true;
                    for (int i = 0; i < names.length; i++){
                        if (!(names[i].equals("*") || names[i].charAt(0) == as.get(i).charAt(0))) {
                            check = false;
                            break;
                        }

                    }
                    if (check) {
                        result.add(String.join(" ", as));
                    }
                }
            }
            result.sort((a, b) -> {
                String[] aa = a.split(" ");
                String[] bb = b.split(" ");
                String nameA = aa[aa.length - 1];
                String nameB = bb[bb.length - 1];
                String nameA1 = aa[0];
                String nameB1 = bb[0];
                if (!nameA.equals(nameB)) return nameA.compareTo(nameB);
                return nameA1.compareTo(nameB1);
            });
            for (String s : result) System.out.println(s);
        }
    }
}
