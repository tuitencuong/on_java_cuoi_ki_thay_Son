import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,PhongBan> dsPB=new HashMap<>();
        int t=Integer.parseInt(sc.nextLine());
        while (t-->0){
            String tmp[]=sc.nextLine().split("\\s+");
            String ten="";
            for(int i=1;i<tmp.length;i++) ten+=tmp[i]+" ";
            dsPB.put(tmp[0],new PhongBan(tmp[0],ten.trim()));
        }
        t=Integer.parseInt(sc.nextLine());
        while (t-->0){
            String id= sc.nextLine();
            NhanVien a=new NhanVien(id,sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),dsPB.get(id.substring(3,5)));
            System.out.println(a);
        }
    }
}