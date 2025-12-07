public class KhachHang {
    private String id,ten,gioiTinh,ngaySinh,diaChi;

    public KhachHang(String id, String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.id = id;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }
}
