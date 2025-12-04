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
        while (t-->0){
            ds.add(new ThiSinh(sc.nextLine(),sc.nextLine().trim(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(ds, new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                int cmp = Double.compare(o2.getDiemXetTuyen(), o1.getDiemXetTuyen());
                if (cmp != 0) return cmp;
                return o1.getMaTS().compareTo(o2.getMaTS());
            }
        });
        int chiTieu=Integer.parseInt(sc.nextLine());
        double diemChuan=ds.get(chiTieu-1).getDiemXetTuyen();
        System.out.println(String.format("%.1f",diemChuan));
        for (ThiSinh x:ds){
            System.out.print(x);
            if(x.getDiemXetTuyen()<diemChuan) System.out.println("TRUOT");
            else System.out.println("TRUNG TUYEN");
        }
    }
}