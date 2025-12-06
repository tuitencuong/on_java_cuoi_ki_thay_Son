import java.io.*;
import java.util.*;

public class WordSet {
    private Set<String> set;

    public WordSet(String filename) throws IOException {
        set = new TreeSet<>();
        Scanner sc = new Scanner(new File(filename));

        while (sc.hasNext()) {
            set.add(sc.next().toLowerCase());
        }

        sc.close();
    }

    public WordSet(Set<String> s) {
        this.set = s;
    }

    public WordSet union(WordSet other) {
        Set<String> res = new TreeSet<>(this.set);
        res.addAll(other.set);
        return new WordSet(res);
    }

    public WordSet intersection(WordSet other) {
        Set<String> res = new TreeSet<>(this.set);
        res.retainAll(other.set);
        return new WordSet(res);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String w : set) {
            sb.append(w).append(" ");
        }
        return sb.toString().trim();
    }
}