import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1=new Scanner(new File("SINHVIEN.in"));
        Scanner sc2=new Scanner(new File("BAITAP.in"));
        Scanner sc3=new Scanner(new File("NHOM.in"));
        HashMap<String,SinhVien> dsSV=new HashMap<>();
        HashMap<Integer,BaiTap> dsBT=new HashMap<>();
        ArrayList<Nhom> dsNhom=new ArrayList<>();
        int n=Integer.parseInt(sc1.nextLine());
        for(int i=1;i<=n;i++){
            String id=sc1.nextLine();
            dsSV.put(id,new SinhVien(id,sc1.nextLine(),sc1.nextLine()));
        }
        int t=Integer.parseInt(sc2.nextLine());
        for(int i=1;i<=t;i++){
            dsBT.put(i,new BaiTap(i,sc2.nextLine()));
        }
        for(int i=1;i<=n;i++){
            dsNhom.add(new Nhom(dsSV.get(sc3.next()),dsBT.get(sc3.nextInt())));
        }
        Collections.sort(dsNhom);
        for(Nhom x:dsNhom) System.out.println(x);
    }
}