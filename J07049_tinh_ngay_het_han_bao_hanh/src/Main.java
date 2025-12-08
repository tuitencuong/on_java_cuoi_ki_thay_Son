import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("MUAHANG.in"));
        int t=Integer.parseInt(sc.nextLine());
        HashMap<String,SanPham> dsSP=new HashMap<>();
        while (t-->0){
            String id=sc.nextLine();
            dsSP.put(id,new SanPham(id,sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        t=Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> ds=new ArrayList<>();
        for(int i=1;i<=t;i++){
            String id=String.format("KH%02d",i);
            ds.add(new KhachHang(id,sc.nextLine(),sc.nextLine(),dsSP.get(sc.nextLine()),Integer.parseInt(sc.nextLine()),sc.nextLine()));
        }
        Collections.sort(ds);
        for(KhachHang x:ds) System.out.println(x);
    }
}