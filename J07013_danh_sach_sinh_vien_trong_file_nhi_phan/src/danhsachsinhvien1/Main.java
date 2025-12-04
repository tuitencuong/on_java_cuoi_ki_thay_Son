package danhsachsinhvien1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> a = (ArrayList<SinhVien>) o.readObject();
        a.forEach(e -> System.out.println(e));
    }
}