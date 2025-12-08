import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("DATA.in"));
        int t=Integer.parseInt(sc.nextLine());
        HashMap<String,Phong> dsP=new HashMap<>();
        while (t-->0){
            String rac=sc.nextLine();
            String tmp[]=rac.split("\\s+");
            String id=tmp[0];
            dsP.put(id,new Phong(id,tmp[1],Integer.parseInt(tmp[2]),Double.parseDouble(tmp[3])));
        }
        ArrayList<KhachHang> ds=new ArrayList<>();
        t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String id=String.format("KH%02d",i);
            String tenKH=sc.nextLine();
            String soPhong=sc.nextLine();
            ds.add(new KhachHang(id,tenKH,soPhong,dsP.get(soPhong.substring(2,3)),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ds);
        for(KhachHang x:ds) System.out.println(x);
    }
}