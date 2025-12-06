import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("SINHVIEN.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ds=new ArrayList<>();
        while (t-->0){
            ds.add(new SinhVien(sc.nextLine(),sc.nextLine().trim(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(ds);
        for(SinhVien x:ds) System.out.println(x);
    }
}