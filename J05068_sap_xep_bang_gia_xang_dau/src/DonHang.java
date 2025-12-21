import java.util.Comparator;

public class DonHang implements Comparable<DonHang> {
    private String id;
    private int soLuong;

    public DonHang(String id, int soLuong) {
        this.id = id;
        this.soLuong = soLuong;
    }

    public String hang(){
        String tmp=id.substring(3,5);
        if(tmp.equals("BP")) return "British Petro";
        if(tmp.equals("ES")) return "Esso";
        if(tmp.equals("SH")) return "Shell";
        if(tmp.equals("CA")) return "Castrol";
        if(tmp.equals("MO")) return "Mobil";
        return "Trong Nuoc";
    }
    public int donGia(){
        String tmp=id.substring(0,1);
        if(tmp.equals("X")) return  128000;
        if(tmp.equals("D")) return  11200;
        if(tmp.equals("N")) return  9700;
        return 0;
    }
    public long thue(){
        if(hang().equals("Trong Nuoc")) return 0;
        String tmp=id.substring(0,1);
        if(tmp.equals("X")) return  1L*donGia()*soLuong*3/100;
        if(tmp.equals("D")) return  1L*donGia()*soLuong*35/1000;
        if(tmp.equals("N")) return  1L*donGia()*soLuong*2/100;
        return 0;
    }
    public Long thanhTien(){
        return 1L*donGia()*soLuong+thue();
    }
    @Override
    public String toString(){
        return id+" "+hang()+" "+donGia()+" "+thue()+" "+thanhTien();
    }

    @Override
    public int compareTo(DonHang o) {
        return o.thanhTien().compareTo(thanhTien());
    }
}
