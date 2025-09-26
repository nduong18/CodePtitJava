
import java.util.Scanner;

public class J04020 {
    static boolean prime(Integer x){
        if (x < 2) return false;
        for (int i = 2; i*i <= x; i++){
            if (x % i == 0) return false;
        }
        return true;
    }
    static class Pair<T, U>{
        private Integer x;
        private Integer y;
        public Pair(Integer a, Integer b){
            x = a;
            y = b;
        }
        public boolean isPrime(){
            return prime(x) && prime(y);
        }
        @Override
        public String toString(){
            return String.format("%d %d", x, y);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
