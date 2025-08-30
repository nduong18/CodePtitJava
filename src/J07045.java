import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07045 {
    static class LoaiPhong implements Comparable<LoaiPhong>{
        private final String kyHieu;
        private final String tenPhong;
        private final int donGia;
        private final double phiPV;

        public LoaiPhong(String line){
            String[] words = line.trim().split("\\s+");
            this.kyHieu = words[0];
            this.tenPhong = words[1];
            this.donGia = Integer.parseInt(words[2]);
            this.phiPV = Double.parseDouble(words[3]);
        }

        @Override
        public int compareTo(LoaiPhong o){
            return this.tenPhong.compareTo(o.tenPhong);
        }

        @Override
        public String toString(){
            return this.kyHieu + " " + this.tenPhong + " " + this.donGia + " " + String.format("%.2f",this.phiPV);
        }
    }
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
