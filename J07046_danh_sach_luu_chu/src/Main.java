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
        Scanner sc=new Scanner(new File("KHACH.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Khach> ds=new ArrayList<>();
        for(int i=1;i<=t;i++){
            String id="KH"+String.format("%02d",i);
            ds.add(new Khach(id,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ds, new Comparator<Khach>() {
            @Override
            public int compare(Khach o1, Khach o2) {
                return o2.soNgayLuuChu().compareTo(o1.soNgayLuuChu());
            }
        });
        for (Khach x:ds) System.out.println(x);
    }
}