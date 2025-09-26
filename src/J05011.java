import java.util.*;
public class J05011 {
    static class Player{
        private String ms, ten, bd, kt;
        private int gio, phut;
        public Player(String ms, String ten, String bd, String kt){
            this.ms = ms.trim();
            this.ten = ten.trim();
            this.bd = bd.trim();
            this.kt = kt.trim();
            
            int giokt = Integer.parseInt(kt.substring(0,2));
            int giobd = Integer.parseInt(bd.substring(0,2));
            
            int phutkt = Integer.parseInt(kt.substring(3));
            int phutbd = Integer.parseInt(bd.substring(3));         
            
            int start = giobd * 60 + phutbd;
            int end = giokt * 60 + phutkt;
            this.gio = (end - start) / 60;
            this.phut = (end - start) % 60;           
        }
        @Override
        public String toString(){
            return String.format("%s %s %d gio %d phut", this.ms, this.ten, this.gio, this.phut);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Player> list = new ArrayList();
        while (t-->0){
            Player p = new Player(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(p);
        }
        list.sort((a, b) -> {
            if (a.gio != b.gio) return b.gio - a.gio;
            return b.phut - a.phut;
        });
        for (Player p : list) System.out.println(p);
    }
}
