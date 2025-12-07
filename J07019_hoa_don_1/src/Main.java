import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1=new Scanner(new File("DATA1.in"));
        Scanner sc2=new Scanner(new File("DATA2.in"));
        HashMap<String,SanPham> map1=new HashMap<>();
        int t=Integer.parseInt(sc1.nextLine());
        while (t-->0){
            String id=sc1.nextLine();
            map1.put(id,new SanPham(id,sc1.nextLine(),Integer.parseInt(sc1.nextLine()),Integer.parseInt(sc1.nextLine())));
        }
        int q=sc2.nextInt();
        for(int i=1;i<=q;i++){
            String id=sc2.next()+String.format("-%03d",i);
            HoaDon x=new HoaDon(id,map1.get(id.substring(0,2)), sc2.nextInt());
            System.out.println(x);
        }
    }
}