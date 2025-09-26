import java.io.File;
import java.io.IOException;
import java.util.*;
public class J07009 {
    static class IntSet{
        private TreeSet<Integer> set;
        public IntSet(int[] x){
            set = new TreeSet<Integer>();
            for (int i : x) set.add(i);
        }
        public IntSet(Set<Integer> other){
            set = new TreeSet<>(other);
        }
        public IntSet intersection(IntSet other){
            Set<Integer> res = new TreeSet<>(this.set);
            res.retainAll(other.set);
            return new IntSet(res);
        }
        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            for (int i : set) sb.append(i).append(" ");
            return sb.toString().trim();
        }
    }
    public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(new File("DATA.in"));
            int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
            for(int i = 0; i<n; i++) a[i] = sc.nextInt();
            for(int i = 0; i<m; i++) b[i] = sc.nextInt();
            IntSet s1 = new IntSet(a);
            IntSet s2 = new IntSet(b);
            IntSet s3 = s1.intersection(s2);
            System.out.println(s3);
        }
}
