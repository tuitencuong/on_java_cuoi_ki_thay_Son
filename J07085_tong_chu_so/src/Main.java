import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void in(String s){
        String ans="0";
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))) {
                ans+=s.charAt(i);
                cnt+=Integer.parseInt(new String(String.valueOf(s.charAt(i))));
            }
        }
        BigInteger tmp= new BigInteger(ans);
        System.out.println(tmp+" "+cnt);

    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> ds=(ArrayList<String>) ois.readObject();
        for (String x:ds) in(x);
    }
}