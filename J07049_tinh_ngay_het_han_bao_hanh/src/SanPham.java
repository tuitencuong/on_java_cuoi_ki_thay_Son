public class SanPham {
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
}
