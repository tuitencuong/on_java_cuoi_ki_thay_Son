import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("XETTUYEN.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> ds=new ArrayList<>();
        for(int i=1;i<=t;i++){
            String id="PH"+String.format("%02d",i);
            ds.add(new ThiSinh(id,sc.nextLine().trim(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        for(ThiSinh x:ds) System.out.println(x);
    }
}