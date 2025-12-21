import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<CuaRo> ds=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while (t-->0){
            ds.add(new CuaRo(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ds);
        for(CuaRo x:ds) System.out.println(x);
    }
}