import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("VANBAN.in"));
        int t=Integer.parseInt(sc.nextLine());
        HashMap<String,Integer> map=new HashMap<>();
        while (t-->0){
            String tmp[]=sc.nextLine().toLowerCase().split("[^a-z0-9]+");
            for(String x:tmp) {
                if(!x.isEmpty()){
                    if (!map.containsKey(x)) map.put(x,1);
                    else map.put(x,map.get(x)+1);
                }
            }
        }
        ArrayList<Word> ds=new ArrayList<>();
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            ds.add(new Word(entry.getKey(), entry.getValue()));
        }
        Collections.sort(ds);
        for(Word x:ds) System.out.println(x);
    }
}