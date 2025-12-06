import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1=new Scanner(new File("MONHOC.in"));
        Map<String,MonHoc> map1=new HashMap<>();
        int t=Integer.parseInt(sc1.nextLine());
        while (t-->0){
            String id=sc1.nextLine();
            map1.put(id,new MonHoc(id,sc1.nextLine(),Integer.parseInt(sc1.nextLine())));
        }
        Scanner sc2=new Scanner(new File("LICHGD.in"));
        Map<String, ArrayList<LichDay>> map2=new HashMap<>();
        int q=Integer.parseInt(sc2.nextLine());
        for(int i=1;i<=q;i++){
            String id=String.format("HP%03d",i);
            String maMon=sc2.nextLine();
            if(!map2.containsKey(maMon)) map2.put(maMon,new ArrayList<>());
            map2.get(maMon).add(new LichDay(map1.get(maMon),id,Integer.parseInt(sc2.nextLine()),Integer.parseInt(sc2.nextLine()),sc2.nextLine(),sc2.nextLine()));
        }
        String key=sc2.nextLine();
        ArrayList<LichDay> ds=new ArrayList<>(map2.get(key));
        Collections.sort(ds);
        System.out.println("LICH GIANG DAY MON "+map1.get(key).getTen()+":");
        for(LichDay x:ds) System.out.println(x);
    }
}