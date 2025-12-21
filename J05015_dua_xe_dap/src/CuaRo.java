import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CuaRo implements Comparable<CuaRo>{
    private String ten,diaChi,thoiGianVeDich;

    public CuaRo(String ten, String diaChi, String thoiGianVeDich) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.thoiGianVeDich = thoiGianVeDich;
        if(thoiGianVeDich.length()==4) this.thoiGianVeDich="0"+thoiGianVeDich;
    }
    public long tinhGio(){
        LocalTime d1=LocalTime.parse(thoiGianVeDich, DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime d2=LocalTime.parse("06:00", DateTimeFormatter.ofPattern("HH:mm"));
        return ChronoUnit.MINUTES.between(d2,d1);
    }
    public Long thanhTich(){
        return Math.round(120.0*60/(tinhGio()));
    }
    public String id(){
        String ans="";
        String tmp1[]=ten.split("\\s+");
        String tmp2[]=diaChi.split("\\s+");
        for(String x:tmp2) ans+=x.charAt(0);
        for(String x:tmp1) ans+=x.charAt(0);
        return ans;
    }
    @Override
    public String toString(){
        return id()+" "+ten+" "+diaChi+" "+thanhTich()+" Km/h";
    }

    @Override
    public int compareTo(CuaRo o) {
        LocalTime d1=LocalTime.parse(o.thoiGianVeDich,DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime d2=LocalTime.parse(thoiGianVeDich,DateTimeFormatter.ofPattern("HH:mm"));
        return d2.compareTo(d1);
    }
}
