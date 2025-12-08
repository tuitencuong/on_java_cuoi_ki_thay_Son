import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean check(String s){
        return s.equals(new StringBuffer(s).reverse().toString());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max1=0;
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        while (sc.hasNext()){
            String s=sc.next();
            if(map.containsKey(s)) map.put(s,map.get(s)+1);
            else{
                if(check(s)){
                    map.put(s,1);
                    max1=Math.max(max1,s.length());
                }
            }
        }
        for(Map.Entry<String, Integer> x:map.entrySet()){
            if(x.getKey().length()==max1){
                System.out.println(x.getKey()+" "+x.getValue());
            }
        }
    }
}