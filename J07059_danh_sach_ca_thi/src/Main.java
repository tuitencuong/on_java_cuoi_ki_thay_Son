import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("CATHI.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<CaThi> ds=new ArrayList<>();
        for(int i=1;i<=t;i++){
            String id=String.format("C%03d",i);
            ds.add(new CaThi(id,sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ds);
        for(CaThi x:ds) System.out.println(x);
    }
}