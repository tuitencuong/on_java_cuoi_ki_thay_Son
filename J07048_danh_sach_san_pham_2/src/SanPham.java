import java.util.Comparator;

public class SanPham implements Comparable<SanPham> {
    private String id,ten;
    private int gia,thoiHanBaoHanh;

    public SanPham(String id, String ten, int gia, int thoiHanBaoHanh) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.thoiHanBaoHanh = thoiHanBaoHanh;
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public int getGia() {
        return gia;
    }

    public int getThoiHanBaoHanh() {
        return thoiHanBaoHanh;
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+gia+" "+thoiHanBaoHanh;
    }

    @Override
    public int compareTo(SanPham o) {
        if(this.gia!=o.gia) return o.gia-this.gia;
        return this.id.compareTo(o.id);
    }
}
