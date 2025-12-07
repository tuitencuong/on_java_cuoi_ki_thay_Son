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
        Scanner sc1=new Scanner(new File("SINHVIEN.in"));
        Scanner sc2=new Scanner(new File("MONHOC.in"));
        Scanner sc3=new Scanner(new File("BANGDIEM.in"));
        HashMap<String,SinhVien> dsSV=new HashMap<>();
        HashMap<String,MonHoc> dsMH=new HashMap<>();
        ArrayList<BangDiem> dsBD=new ArrayList<>();
        int t=Integer.parseInt(sc1.nextLine());
        while (t-->0){
            String id=sc1.nextLine();
            dsSV.put(id,new SinhVien(id,sc1.nextLine().trim(),sc1.nextLine(),sc1.nextLine()));
        }
        t=Integer.parseInt(sc2.nextLine());
        while (t-->0){
            String id=sc2.nextLine();
            dsMH.put(id,new MonHoc(id,sc2.nextLine(),Integer.parseInt(sc2.nextLine())));
        }
        int q=sc3.nextInt();
        while (q-->0){
            dsBD.add(new BangDiem(dsSV.get(sc3.next()),dsMH.get(sc3.next()), sc3.nextDouble()));
        }
        Collections.sort(dsBD);
        t=sc3.nextInt();
        while (t-->0){
            String id=sc3.next();
            System.out.println("BANG DIEM MON "+dsMH.get(id).getTen()+":");
            for(BangDiem x:dsBD){
                if(id.equals(x.getMonHoc().getId())) System.out.println(x);
            }
        }
    }
}