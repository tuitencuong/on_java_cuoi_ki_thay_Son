import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("MONHOC.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> ds=new ArrayList<>();
        while (t-->0){
            MonHoc mh=new MonHoc(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),sc.nextLine(),sc.nextLine());
            if(!mh.getThucHanh().equals("Truc tiep")) ds.add(mh);
        }
        Collections.sort(ds);
        for(MonHoc x:ds) System.out.println(x);
    }
}