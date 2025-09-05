import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J07084 {
    static class Online{
        private final String ten;
        private final long tg;
        public Online(String ten, String t1, String t2){
            this.ten = ten;
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            LocalDateTime d1 = LocalDateTime.parse(t1, fmt);
            LocalDateTime d2 = LocalDateTime.parse(t2, fmt);
            this.tg = Duration.between(d1,d2).toMinutes();
        }
        void showInfo(){
            System.out.printf("%s %d\n", this.ten, this.tg);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Online> arr = new ArrayList<>();
        while (t-- > 0){
            arr.add(new Online(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        arr.sort(Comparator.comparing((Online a) -> a.tg).reversed());
        for (Online o : arr) o.showInfo();
    }
}
