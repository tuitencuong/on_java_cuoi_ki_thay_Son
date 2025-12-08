import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1=new Scanner(new File("MONTHI.in"));
        Scanner sc2=new Scanner(new File("CATHI.in"));
        Scanner sc3=new Scanner(new File("LICHTHI.in"));
        HashMap<String,MonThi> dsMON=new HashMap<>();
        HashMap<String,CaThi> dsCA=new HashMap<>();
        ArrayList<LichThi> dsLich=new ArrayList<>();
        int t=Integer.parseInt(sc1.nextLine());
        while (t-->0){
            String id=sc1.nextLine();
            dsMON.put(id,new MonThi(id,sc1.nextLine(),sc1.nextLine()));
        }
        t=Integer.parseInt(sc2.nextLine());
        for(int i=1;i<=t;i++){
            String id=String.format("C%03d",i);
            dsCA.put(id,new CaThi(id,sc2.nextLine(),sc2.nextLine(),sc2.nextLine()));
        }
        t= sc3.nextInt();
        while (t-->0){
            dsLich.add(new LichThi(dsCA.get(sc3.next()),dsMON.get(sc3.next()),sc3.next(),sc3.nextInt()));
        }
        Collections.sort(dsLich);
        for(LichThi x:dsLich) System.out.println(x);
    }
}