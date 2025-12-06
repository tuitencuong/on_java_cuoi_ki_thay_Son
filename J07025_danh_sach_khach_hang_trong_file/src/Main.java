import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("KHACHHANG.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> ds=new ArrayList<>();
        for(int i=1;i<=t;i++){
            String id=String.format("KH%03d",i);
            ds.add(new KhachHang(id,sc.nextLine().trim(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ds);
        for(KhachHang x:ds) System.out.println(x);
    }
}