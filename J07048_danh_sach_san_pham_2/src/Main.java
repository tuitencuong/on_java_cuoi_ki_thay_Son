import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("SANPHAM.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> ds=new ArrayList<>();
        while (t-->0){
            ds.add(new SanPham(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(ds);
        for(SanPham x:ds) System.out.println(x);
    }
}