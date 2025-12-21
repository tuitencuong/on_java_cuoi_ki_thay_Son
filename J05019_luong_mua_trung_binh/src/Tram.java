import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Tram {
    private String id,ten;
    private long thoiGian=0;
    private int luongMua=0;

    public Tram(String id, String ten) {
        this.id = id;
        this.ten = ten;
    }
    public void setThoiGian(String time1,String time2){
        LocalTime t1=LocalTime.parse(time1, DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime t2=LocalTime.parse(time2, DateTimeFormatter.ofPattern("HH:mm"));
        thoiGian+=ChronoUnit.MINUTES.between(t1,t2);
    }
    public void setLuongMua(int lm){
        luongMua+=lm;
    }
    private Double luongMuaTB(){
        return 1.0*luongMua*60/thoiGian;
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+String.format("%.2f",luongMuaTB());
    }
}