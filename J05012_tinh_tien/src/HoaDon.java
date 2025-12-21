
public class HoaDon implements Comparable<HoaDon> {
    private String id,ten;
    private int soLuong;
    private long donGia,trietKhau;

    public HoaDon(String id, String ten, int soLuong, long donGia, long trietKhau) {
        this.id = id;
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.trietKhau = trietKhau;
    }
    public Long tongTien(){
        return donGia*soLuong-trietKhau;
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+soLuong+" "+donGia+" "+trietKhau+" "+tongTien();
    }

    @Override
    public int compareTo(HoaDon o) {
        return o.tongTien().compareTo(tongTien());
    }
}
