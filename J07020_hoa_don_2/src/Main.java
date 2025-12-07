import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1=new Scanner(new File("KH.in"));
        Scanner sc2=new Scanner(new File("MH.in"));
        Scanner sc3=new Scanner(new File("HD.in"));
        HashMap<String,KhachHang> dsKH=new HashMap<>();
        int t=Integer.parseInt(sc1.nextLine());
        for(int i=1;i<=t;i++){
            String id=String.format("KH%03d",i);
            dsKH.put(id,new KhachHang(id,sc1.nextLine(),sc1.nextLine(),sc1.nextLine(),sc1.nextLine()));
        }
        HashMap<String,MatHang> dsMH=new HashMap<>();
        t=Integer.parseInt(sc2.nextLine());
        for(int i=1;i<=t;i++){
            String id=String.format("MH%03d",i);
            dsMH.put(id,new MatHang(id,sc2.nextLine(),sc2.nextLine(),Integer.parseInt(sc2.nextLine()),Integer.parseInt(sc2.nextLine())));
        }
        int q=sc3.nextInt();
        for(int i=1;i<=q;i++){
            String id=String.format("HD%03d",i);
            HoaDon hoaDon=new HoaDon(id,dsKH.get(sc3.next()),dsMH.get(sc3.next()), sc3.nextInt());
            System.out.println(hoaDon);
        }
    }
}