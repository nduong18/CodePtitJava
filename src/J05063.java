import java.util.*;
public class J05063 {
    static class DaThuc{
        private Map<Integer,Integer> map;
        public DaThuc(String line){
            map = new TreeMap<>(Collections.reverseOrder());
            line = line.replaceAll("\\s+", "");
            if (line.isEmpty()) return;
            String[] words = line.split("(?=\\+)|(?=\\-)");
            for (String x : words){
                String[] z = x.split("\\*x\\^");
                int a = Integer.parseInt(z[0]);
                int b = Integer.parseInt(z[1]);
                map.put(b, map.getOrDefault(b, 0) + a);
            }
        }
        public DaThuc cong(DaThuc other){
            DaThuc res = new DaThuc("");
            res.map.putAll(this.map);
            for (Map.Entry<Integer, Integer> e : other.map.entrySet()){
                res.map.put(e.getKey(), res.map.getOrDefault(e.getKey(),0) + e.getValue());
            }
            return res;
        }
        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<Integer, Integer> e : map.entrySet()){
                if (sb.length() > 0) sb.append(" + ");
                sb.append(e.getValue()).append("*x^").append(e.getKey());
            }
            return sb.toString();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
}
