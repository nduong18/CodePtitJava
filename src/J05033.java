import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05033 {
    static class ThoiGian{
        final private int gio, phut, giay;
        public ThoiGian(int gio, int phut, int giay){
            this.gio = gio;
            this.phut = phut;
            this.giay = giay;
        }
        void showInfo(){
            System.out.printf("%d %d %d\n", this.gio, this.phut, this.giay);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThoiGian> arr = new ArrayList<>();
        while (t-- > 0){
            String[] nums = sc.nextLine().trim().split("\\s+");
            int gio = Integer.parseInt(nums[0]);
            int phut = Integer.parseInt(nums[1]);
            int giay = Integer.parseInt(nums[2]);
            arr.add(new ThoiGian(gio, phut, giay));
        }
        arr.sort(Comparator.
                comparing((ThoiGian a) -> a.gio).
                thenComparing((ThoiGian a) -> a.phut).
                thenComparing((ThoiGian a) -> a.giay));
        for (ThoiGian tg : arr) tg.showInfo();
    }
}
