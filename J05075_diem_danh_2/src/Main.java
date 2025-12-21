import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        LinkedHashMap<String,SinhVien> ds=new LinkedHashMap<>();
        for(int i=0;i<t;i++){
            String id=sc.nextLine();
            ds.put(id,new SinhVien(id,sc.nextLine(),sc.nextLine()));
        }
        for(int i=0;i<t;i++){
            String tmp[]=sc.nextLine().split("\\s+");
            String id=tmp[0];
            ds.get(id).setDiemCC(tmp[1]);
        }
        String lop=sc.nextLine();
        for(Map.Entry<String, SinhVien> x:ds.entrySet()){
            SinhVien a=x.getValue();
            if(a.getLop().equals(lop)) System.out.println(a);
        }
    }
}