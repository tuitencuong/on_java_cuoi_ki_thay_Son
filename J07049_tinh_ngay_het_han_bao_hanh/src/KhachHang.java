import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KhachHang implements Comparable<KhachHang>{
    private String id,ten,diaChi;
    private SanPham sanPham;
    private int soLuong;
    private String ngayMua;

    public KhachHang(String id, String ten, String diaChi, SanPham sanPham, int soLuong, String ngayMua) {
        this.id = id;
        this.ten = ten;
        this.diaChi = diaChi;
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.ngayMua = ngayMua;
    }

    public String getId() {
        return id;
    }

    public int thanhTien(){
        return soLuong* sanPham.getGia();
    }
    public LocalDate hanBaoHanh(){
        LocalDate mua=LocalDate.parse(ngayMua, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return mua.plusMonths(sanPham.getThoiHanBaoHanh());
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+diaChi+" "+sanPham.getId()+" "+thanhTien()+" "+hanBaoHanh().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public int compareTo(KhachHang o) {
        int cmp=hanBaoHanh().compareTo(o.hanBaoHanh());
        if(cmp!=0) return cmp;
        return id.compareTo(o.getId());
    }
}
