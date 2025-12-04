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
        Scanner sc=new Scanner(new File("BANGDIEM.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ds=new ArrayList<>();
        for(int i=1;i<=t;i++){
            String id="SV"+String.format("%02d",i);
            ds.add(new SinhVien(id,sc.nextLine().trim(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(ds, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                int tmp=o2.diemTrungBinh().compareTo(o1.diemTrungBinh());
                if(tmp!=0) return tmp;
                return o1.getId().compareTo(o2.getId());
            }
        });
        int rnk=1;
        for(int i=0;i<ds.size();i++){
            System.out.print(ds.get(i));
            if(i==0){
                rnk=1;
                System.out.println(" 1");
            }
            else{
                int tmp=ds.get(i).diemTrungBinh().compareTo(ds.get(i-1).diemTrungBinh());
                if(tmp!=0) rnk=i+1;
                System.out.println(" "+rnk);
            }
        }
    }
}