import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<GiaoVien> ds =new ArrayList<>();
        int ht=0,hp=0;
        while (t-->0){
            String id=sc.nextLine();
            String tmp=id.substring(0,2);
            if(tmp.equals("HT")&&ht<1){
                ht+=1;
                ds.add(new GiaoVien(id,sc.nextLine(),Integer.parseInt(sc.nextLine())));
            }
            if(tmp.equals("HP")&&hp<2){
                hp+=1;
                ds.add(new GiaoVien(id,sc.nextLine(),Integer.parseInt(sc.nextLine())));
            }
            if(tmp.equals("GV")) ds.add(new GiaoVien(id,sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        for(GiaoVien x:ds) System.out.println(x);
    }
}