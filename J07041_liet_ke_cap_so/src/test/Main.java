package test;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> list = (ArrayList<Pair>) ois.readObject();
        ois.close();

        Set<Pair> ts = new HashSet<>(list);
        ArrayList<Pair> ds=new ArrayList<>(ts);
        Collections.sort(ds);
        for(Pair x:ds){
            if(x.getFirst()<=x.getSecond()) System.out.println(x);
        }
    }
}
