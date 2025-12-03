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
        Scanner sc=new Scanner(new File("MATHANG.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> ds=new ArrayList<>();
        for(int i=1;i<=t;i++){
            String id="MH"+String.format("%02d",i);
            ds.add(new MatHang(id,sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(ds, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return o2.loiNhuan().compareTo(o1.loiNhuan());
            }
        });
        for(MatHang x:ds) System.out.println(x);
    }
}