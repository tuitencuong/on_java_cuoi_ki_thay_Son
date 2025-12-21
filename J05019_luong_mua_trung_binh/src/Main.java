import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        LinkedHashMap<String,Tram> ds= new LinkedHashMap<>();
        while (t-->0){
            String ten=sc.nextLine();
            String id="";
            if(!ds.containsKey(ten)){
                id=String.format("T%02d",ds.size()+1);
                ds.put(ten,new Tram(id,ten));
            }
            Tram tmp=ds.get(ten);
            tmp.setThoiGian(sc.nextLine(),sc.nextLine());
            tmp.setLuongMua(Integer.parseInt(sc.nextLine()));
        }
        for(Map.Entry<String, Tram> x:ds.entrySet()){
            System.out.println(x.getValue());
        }
    }
}