import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Khach {
    private String id,ten,maPhong,ngayDen,ngayDi;

    public Khach(String id, String ten, String maPhong, String ngayDen, String ngayDi) {
        this.id = id;
        this.ten = ten;
        this.maPhong = maPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
    }
    public Long soNgayLuuChu(){
        LocalDate d1=LocalDate.parse(ngayDen, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate d2=LocalDate.parse(ngayDi, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return ChronoUnit.DAYS.between(d1,d2);
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+maPhong+" "+soNgayLuuChu();
    }
}
