import java.util.*;
public class J04022{
    static class WordSet{
        private Set<String> words;
        public WordSet(String line){
            words = new TreeSet<>(Arrays.asList(line.toLowerCase().split("\\s+")));
        }
        public String union(WordSet other){
            Set<String> res = new TreeSet<>(words);
            res.addAll(other.words);
            return String.join(" ", res);
        }
        public String intersection(WordSet other){
            Set<String> res = new TreeSet<>(words);
            res.retainAll(other.words);
            return String.join(" ", res);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2)); 
    }
}