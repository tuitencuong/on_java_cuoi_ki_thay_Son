import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SinhVien {
    private String id,ten,lop,ns;
    double gpa;

    public SinhVien(String id, String ten, String lop, String ns, double gpa) {
        this.id = id;
        this.ten = chuanHoaTen(ten);
        this.lop = lop;
        this.ns = ns;
        this.gpa = gpa;
    }
    public String chuanHoaNgay(String s){
        StringBuilder tmp=new StringBuilder(s);
        if(tmp.charAt(1)=='/') tmp.insert(0,"0");
        if(tmp.charAt(4)=='/') tmp.insert(3,"0");
        return tmp.toString();
    }
    public String chuanHoaTen(String s){
        String tmp[]=s.split("\\s+");
        String ans="";
        for(String x:tmp) ans+=x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        return ans.trim();
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+lop+" "+chuanHoaNgay(ns)+" "+String.format("%.2f",gpa);
    }
}
