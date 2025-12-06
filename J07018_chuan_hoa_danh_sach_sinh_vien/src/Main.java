import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("SINHVIEN.in"));
        Integer t=Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ds=new ArrayList<>();
        for(int i=1;i<=t;i++){
            String id="B20DCCN"+String.format("%03d",i);
            ds.add(new SinhVien(id,sc.nextLine().trim(),sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine())));
        }
        for(SinhVien x:ds) System.out.println(x);
    }
}