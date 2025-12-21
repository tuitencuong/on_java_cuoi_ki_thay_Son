import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<DonHang> ds=new ArrayList<>();
        while (t-->0){
            DonHang a=new DonHang(sc.next(),sc.nextInt());
            ds.add(a);
        }
        Collections.sort(ds);
        for(DonHang x:ds) System.out.println(x);
    }
}