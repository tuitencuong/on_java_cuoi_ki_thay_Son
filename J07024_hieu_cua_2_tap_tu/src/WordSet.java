import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordSet {
    private Set<String> set;
    public WordSet(String file) throws FileNotFoundException {
        Scanner sc=new Scanner(new File(file));
        set=new TreeSet<>();
        while (sc.hasNext()){
            set.add(sc.next().toLowerCase());
        }
        sc.close();
    }

    public WordSet(Set<String> set) {
        this.set = set;
    }

    public Set<String> getSet() {
        return set;
    }

    public WordSet difference(WordSet o){
        Set<String> res=new TreeSet<>(set);
        res.removeAll(o.getSet());
        return new WordSet(res);
    }
    @Override
    public String toString() {
        String ans="";
        for (String w : set) {
            ans+=w+" ";
        }
        return ans.trim();
    }
}
