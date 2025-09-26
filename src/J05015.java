import java.util.*;
public class J05015 {
    static class Player{
        private String ten, dc, tg, ms;
        private int vt;
        public Player(String ten, String dc, String tg){
            this.ten = ten;
            this.dc = dc;
            
            StringBuilder sb = new StringBuilder();
            String[] TEN = ten.split("\\s+");
            String[] DC = dc.split("\\s+");
            for (String s : DC) sb.append(Character.toUpperCase(s.charAt(0)));
            for (String s : TEN) sb.append(Character.toUpperCase(s.charAt(0)));          
            this.ms = sb.toString();
            
            String[] TG = tg.split(":");
            int gio = Integer.parseInt(TG[0]);
            int phut = Integer.parseInt(TG[1]);
            double hours = (gio * 60 + phut - 6 * 60) / 60.0;
            this.vt = (int) Math.round(120 / hours); ;
        }
        @Override
        public String toString(){
            return String.format("%s %s %s %d Km/h", this.ms, this.ten, this.dc, this.vt);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Player> list = new ArrayList<>();
        while(t-->0){
            Player p = new Player(sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(p);
        }
        list.sort((a, b) -> Integer.compare(b.vt, a.vt));
        for (Player p : list) System.out.println(p);
    }
}
