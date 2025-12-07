import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1=new Scanner(new File("MONHOC.in"));
        Scanner sc2=new Scanner(new File("GIANGVIEN.in"));
        Scanner sc3=new Scanner(new File("GIOCHUAN.in"));
        int n=Integer.parseInt(sc1.nextLine());
        HashMap<String,MonHoc> map1=new HashMap<>();
        while (n-->0){
            String tmp=sc1.nextLine();
            String arr[]=tmp.split("\\s+");
            String id=arr[0],ten="";
            for(int i=1;i<arr.length;i++) ten+=arr[i]+" ";
            map1.put(id,new MonHoc(id,ten.trim()));
        }
        int m=Integer.parseInt(sc2.nextLine());
        LinkedHashMap<String,GiangVien> map2=new LinkedHashMap<>();
        while (m-->0){
            String tmp=sc2.nextLine();
            String arr[]=tmp.split("\\s+");
            String id=arr[0],ten="";
            for(int i=1;i<arr.length;i++) ten+=arr[i]+" ";
            map2.put(id,new GiangVien(id,ten.trim()));
        }
        int q=Integer.parseInt(sc3.nextLine());
        while (q-->0){
            String tmp=sc3.nextLine();
            String arr[]=tmp.split("\\s+");
            map2.get(arr[0]).setGio(Double.parseDouble(arr[2]));
        }
        for(GiangVien x: map2.values()) System.out.println(x);
    }
}