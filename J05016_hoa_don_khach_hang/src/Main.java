import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> ds=new ArrayList<>();
        for(int i=1;i<=t;i++){
            String id=String.format("KH%02d",i);
            ds.add(new KhachHang(id,sc.nextLine().trim(),sc.nextLine().trim(),sc.nextLine().trim(),sc.nextLine().trim(),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(ds);
        for(KhachHang x:ds) System.out.println(x);
    }
}