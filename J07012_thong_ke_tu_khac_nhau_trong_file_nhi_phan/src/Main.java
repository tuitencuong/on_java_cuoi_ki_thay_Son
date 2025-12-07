import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> ds=(ArrayList<String>) ois.readObject();
        HashMap<String,Integer> map=new HashMap<>();
        for(String s:ds){
            String tmp[]=s.toLowerCase().split("[^a-z0-9]+");
            for(String x:tmp) {
                if(!x.isEmpty()){
                    if (!map.containsKey(x)) map.put(x,1);
                    else map.put(x,map.get(x)+1);
                }
            }
        }
        ArrayList<Word> ds1=new ArrayList<>();
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            ds1.add(new Word(entry.getKey(), entry.getValue()));
        }
        Collections.sort(ds1);
        for(Word x:ds1) System.out.println(x);
    }
}