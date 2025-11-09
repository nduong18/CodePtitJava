import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J05032 {
    static class Person{
        private String ten;
        int ngay, thang, nam;
        private Person(String ten, int ngay,int thang, int nam){
            this.ten = ten;
            this.ngay = ngay;
            this.thang = thang;
            this.nam  = nam;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Person> P = new ArrayList<>();
        while (t-- > 0){
            String[] tmp = sc.nextLine().trim().split("\\s+");
            String ten = tmp[0];
            String date = tmp[1];
            P.add(new Person(ten, Integer.parseInt(date.substring(0,2)), Integer.parseInt(date.substring(3,5)), Integer.parseInt(date.substring(6))));
        }
        P.sort((a, b) ->{
            int cmp = Integer.compare(a.nam, b.nam);
            if (cmp != 0) return cmp;
            int cmp1 = Integer.compare(a.thang, b.thang);
            if (cmp1 != 0) return cmp1;
            return Integer.compare(a.ngay, b.ngay);
        });
        Person giaNhat = P.get(0);
        Person treNhat = P.get(P.size() - 1);
        System.out.println(treNhat.ten + "\n" + giaNhat.ten);
    }
}

