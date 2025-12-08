import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class KhachHang implements Comparable<KhachHang>{
    private String id,ten;
    private String soPhong;
    private Phong phong;
    private String ngayDen,ngayDi;

    public KhachHang(String id, String ten,String soPhong,Phong phong , String ngayDen, String ngayDi) {
        this.id = id;
        this.ten = ten;
        this.soPhong = soPhong;
        this.phong = phong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
    }

    public Long soNgayLuuTru(){
        LocalDate d1=LocalDate.parse(ngayDen, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate d2=LocalDate.parse(ngayDi, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        long ngay= ChronoUnit.DAYS.between(d1,d2);
        return ngay;
    }
    public Double thanhTien(){
        double giamGia=0;
        if(soNgayLuuTru()>30) giamGia=0.06;
        else if(soNgayLuuTru()>=20) giamGia=0.04;
        else if(soNgayLuuTru()>=10) giamGia=0.02;
        long ngay=soNgayLuuTru();
        if(ngay==0) ngay+=1;
        return (phong.getDonGia()*ngay)*(1+ phong.getPhiDichVu())*(1-giamGia);
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+soPhong+" "+soNgayLuuTru()+" "+String.format("%.2f",thanhTien());
    }

    @Override
    public int compareTo(KhachHang o) {
        return o.soNgayLuuTru().compareTo(soNgayLuuTru());
    }
}
