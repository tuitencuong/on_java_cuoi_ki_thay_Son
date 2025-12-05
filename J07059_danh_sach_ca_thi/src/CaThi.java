import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CaThi implements Comparable<CaThi>{
    private String id,ngayThi,gioThi,phongThi;

    public CaThi(String id, String ngayThi, String gioThi, String phongThi) {
        this.id = id;
        this.ngayThi = ngayThi;
        this.gioThi = gioThi;
        this.phongThi = phongThi;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString(){
        return id+" "+ngayThi+" "+gioThi+" "+phongThi;
    }
    public LocalDateTime chuyen(){
        return LocalDateTime.parse(ngayThi+" "+gioThi, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }

    @Override
    public int compareTo(CaThi o) {
        int cmp=chuyen().compareTo(o.chuyen());
        if(cmp!=0) return cmp;
        return this.id.compareTo(o.getId());
    }
}
