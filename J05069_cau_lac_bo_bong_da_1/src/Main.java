import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,CLB> dsCLB=new HashMap<>();
        int t=Integer.parseInt(sc.nextLine());
        while (t-->0){
            String id=sc.nextLine();
            dsCLB.put(id,new CLB(id,sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        ArrayList<TranDau> ds=new ArrayList<>();
        t= sc.nextInt();
        while (t-->0){
            String id=sc.next();
            ds.add(new TranDau(id,sc.nextInt(),dsCLB.get(id.substring(1,3))));
        }
        for(TranDau x:ds) System.out.println(x);
    }
}