import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KhachHang implements Comparable<KhachHang>{
    private String id,ten,gioiTinh,ngaySinh,diaChi;

    public KhachHang(String id, String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.id = id;
        this.ten = chuanHoaTen(ten);
        this.gioiTinh = gioiTinh;
        this.ngaySinh = chuanHoaNgay(ngaySinh);
        this.diaChi = diaChi;
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

    public String getNgaySinh() {
        return ngaySinh;
    }

    @Override
    public String toString() {
        return id+" "+ten+" "+gioiTinh+" "+diaChi+" "+ngaySinh;
    }

    @Override
    public int compareTo(KhachHang o) {
        LocalDate d1=LocalDate.parse(ngaySinh, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate d2=LocalDate.parse(o.getNgaySinh(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return d1.compareTo(d2);
    }
}
