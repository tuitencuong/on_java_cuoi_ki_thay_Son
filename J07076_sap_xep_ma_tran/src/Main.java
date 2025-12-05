import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("MATRIX.in"));
        int t=sc.nextInt();
        while (t-->0){
            MaTran mt=new MaTran(sc.nextInt(),sc.nextInt(),sc.nextInt());
            int a[][]=new int[mt.getN()][mt.getM()];
            for(int i=0;i<mt.getN();i++){
                for(int j=0;j<mt.getM();j++){
                    a[i][j]=sc.nextInt();
                }
            }
            mt.setA(a);
            mt.in();
        }
    }
}