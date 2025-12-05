import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class SinhVien implements Comparable<SinhVien>{
    private String ten;
    private String thoiGianBatDau,thoiGianKetThuc;

    public SinhVien(String ten, String thoiGianBatDau, String thoiGianKetThuc) {
        this.ten = ten;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
    }
    public Long tinhThoiGian(){
        LocalDateTime t1=LocalDateTime.parse(thoiGianBatDau, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        LocalDateTime t2=LocalDateTime.parse(thoiGianKetThuc, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        return ChronoUnit.MINUTES.between(t1,t2);
    }

    public String getTen() {
        return ten;
    }

    @Override
    public String toString(){
        return ten+" "+tinhThoiGian();
    }

    @Override
    public int compareTo(SinhVien o) {
        int cmp=o.tinhThoiGian().compareTo(tinhThoiGian());
        if(cmp!=0) return cmp;
        return ten.compareTo(o.getTen());
    }
}
