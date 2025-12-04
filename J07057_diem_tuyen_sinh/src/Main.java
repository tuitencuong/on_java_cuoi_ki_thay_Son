import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("THISINH.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> ds=new ArrayList<>();
        for(int i=1;i<=t;i++){
            String id="TS"+String.format("%02d",i);
            ds.add(new ThiSinh(id,sc.nextLine().trim(),Double.parseDouble(sc.nextLine()),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(ds, new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                int cmp=o2.tongDiem().compareTo(o1.tongDiem());
                if(cmp!=0) return cmp;
                return o1.getId().compareTo(o2.getId());
            }
        });
        for(ThiSinh x:ds) System.out.println(x);
    }
}