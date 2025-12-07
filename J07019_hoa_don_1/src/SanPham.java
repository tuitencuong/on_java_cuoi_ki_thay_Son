public class SanPham {
    private String id,ten;
    private int giaLoai1,giaLoai2;

    public SanPham(String id, String ten, int giaLoai1, int giaLoai2) {
        this.id = id;
        this.ten = ten;
        this.giaLoai1 = giaLoai1;
        this.giaLoai2 = giaLoai2;
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public int getGiaLoai1() {
        return giaLoai1;
    }

    public int getGiaLoai2() {
        return giaLoai2;
    }
}
