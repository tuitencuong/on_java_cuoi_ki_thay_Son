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
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> ds=new ArrayList<>();
        while (t-->0){
            ds.add(new GiangVien(sc.nextLine()));
        }
        Collections.sort(ds);
        int q=Integer.parseInt(sc.nextLine());
        while (q-->0){
            String s=sc.nextLine();
            for(GiangVien x:ds){
                if(x.soSanh(s))
                    System.out.println(x);
            }
        }
    }
}