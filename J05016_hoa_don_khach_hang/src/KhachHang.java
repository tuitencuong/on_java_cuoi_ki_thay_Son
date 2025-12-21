import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class KhachHang implements Comparable<KhachHang>{
    private String id,ten,soPhong,ngayDen,ngayDi;
    private int phatSinh;

    public KhachHang(String id, String ten, String soPhong, String ngayDen, String ngayDi, int phatSinh) {
        this.id = id;
        this.ten = ten;
        this.soPhong = soPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
        this.phatSinh = phatSinh;
    }
    public Long tinhNgay(){
        LocalDate d1=LocalDate.parse(ngayDen, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate d2=LocalDate.parse(ngayDi, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return ChronoUnit.DAYS.between(d1,d2)+1;
    }
    public int giaPhong(){
        int tmp=Integer.parseInt(soPhong.substring(0,1));
        if(tmp==1) return 25;
        if(tmp==2) return 34;
        if(tmp==3) return 50;
        if(tmp==4) return 80;
        return 0;
    }
    public Long tongTien(){
        return tinhNgay()*giaPhong()+phatSinh;
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+soPhong+" "+tinhNgay()+" "+tongTien();

    }

    @Override
    public int compareTo(KhachHang o) {
        return o.tongTien().compareTo(tongTien());
    }
}
