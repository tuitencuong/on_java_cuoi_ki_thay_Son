import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LichThi implements Comparable<LichThi>{
    private CaThi caThi;
    private MonThi monThi;
    private String maNhom;
    private int soLuong;

    public LichThi(CaThi caThi, MonThi monThi, String maNhom, int soLuong) {
        this.caThi = caThi;
        this.monThi = monThi;
        this.maNhom = maNhom;
        this.soLuong = soLuong;
    }
    public LocalDate thoiGianThi(){
        return LocalDate.parse(caThi.getNgayThi()+" "+caThi.getGioThi(), DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }

    @Override
    public String toString(){
        return caThi.getNgayThi()+" "+caThi.getGioThi()+" "+caThi.getPhongThi()+" "+
                monThi.getTen()+" "+maNhom+" "+soLuong;
    }

    @Override
    public int compareTo(LichThi o) {
        int cmp=thoiGianThi().compareTo(o.thoiGianThi());
        if(cmp!=0) return cmp;
        return caThi.getId().compareTo(o.caThi.getId());
    }
}
