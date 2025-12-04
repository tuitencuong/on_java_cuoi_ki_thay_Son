import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class KhachHang {
    private String id,ten,soPhong,ngayNhan,ngayTra;
    private int tienDichVu;

    public KhachHang(String id, String ten, String soPhong, String ngayNhan, String ngayTra, int tienDichVu) {
        this.id = id;
        this.ten = chuanHoaTen(ten);
        this.soPhong = soPhong;
        this.ngayNhan = chuanHoaNgay(ngayNhan);
        this.ngayTra = chuanHoaNgay(ngayTra);
        this.tienDichVu = tienDichVu;
    }

    public String chuanHoaTen(String s){
        String tmp[]=s.split("\\s+");
        String ans="";
        for(String x:tmp){
            ans+=x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        return ans.trim();
    }
    public String chuanHoaNgay(String s){
        StringBuilder tmp=new StringBuilder(s);
        if(tmp.charAt(1)=='/') tmp.insert(0,"0");
        if(tmp.charAt(4)=='/') tmp.insert(3,"0");
        return tmp.toString();
    }
    public Long tinhSoNgayO(){
        LocalDate d1=LocalDate.parse(ngayTra, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate d2=LocalDate.parse(ngayNhan, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return ChronoUnit.DAYS.between(d2,d1)+1;
    }
    public Long tinhTongTien(){
        int gia = 0;
        if(soPhong.charAt(0)=='1') gia=25;
        if(soPhong.charAt(0)=='2') gia=34;
        if(soPhong.charAt(0)=='3') gia=50;
        if(soPhong.charAt(0)=='4') gia=80;
        return gia*tinhSoNgayO()+tienDichVu;
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+soPhong+" "+tinhSoNgayO()+" "+tinhTongTien();
    }
}
