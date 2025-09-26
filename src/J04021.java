import java.util.*;
public class J04021 {
    static class IntSet{
        private TreeSet<Integer> SET;
        public IntSet(int[] x){
            SET = new TreeSet<>();
            for (int i : x) SET.add(i);
        }
        private IntSet(Set<Integer> x){
            SET = new TreeSet<>(x);
        }
        public IntSet union(IntSet x){
            Set<Integer> res = new TreeSet<>(SET);
            res.addAll(x.SET);
            return new IntSet(res);
        }
        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            for (int i : SET) sb.append(i).append(" ");
            return sb.toString();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
