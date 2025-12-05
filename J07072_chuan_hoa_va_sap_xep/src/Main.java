import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("DANHSACH.in"));
        ArrayList<GiangVien> ds=new ArrayList<>();
        while (sc.hasNextLine()){
            ds.add(new GiangVien(sc.nextLine().trim()));
        }
        Collections.sort(ds);
        for(GiangVien x:ds) System.out.println(x);
    }
}